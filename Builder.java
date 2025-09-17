import java.util.ArrayList;
import java.util.List;

final class Builder {

    private String tableName;

    // order by
    private String orderByColumn;
    private String orderByValue;


    // where condition

    List<String> whereList = new ArrayList<>();


    public Builder(String tableName) {
        this.tableName = tableName;

    }

    public Builder where(String whereConditionColumn, String whereConditionOperator, String whereConditionValue) {
        whereList.add(whereConditionColumn + " " + whereConditionOperator + " " + whereConditionValue );
        return this;
    }

    public Builder orderBy(String orderByColumn, String orderByValue) {
        this.orderByColumn = orderByColumn;
        this.orderByValue = orderByValue;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Select * from ").append(this.tableName);
        if (!whereList.isEmpty()) {
            sb.append(" where ").append(String.join(" and ", this.whereList));
        }

        if (orderByColumn != null) {
            sb.append(" order by ").append(orderByColumn).append(" ").append(orderByValue);
        }
        return sb.toString();
    }


}