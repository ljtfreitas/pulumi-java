// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleDynamodbv2PutItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleDynamodbv2PutItemArgs Empty = new TopicRuleDynamodbv2PutItemArgs();

    /**
     * The name of the DynamoDB table.
     * 
     */
    @InputImport(name="tableName", required=true)
    private final Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName;
    }

    public TopicRuleDynamodbv2PutItemArgs(Input<String> tableName) {
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private TopicRuleDynamodbv2PutItemArgs() {
        this.tableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDynamodbv2PutItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDynamodbv2PutItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableName = defaults.tableName;
        }

        public Builder setTableName(Input<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Input.of(Objects.requireNonNull(tableName));
            return this;
        }
        public TopicRuleDynamodbv2PutItemArgs build() {
            return new TopicRuleDynamodbv2PutItemArgs(tableName);
        }
    }
}
