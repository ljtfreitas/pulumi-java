// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TopicRuleDynamodbv2PutItem {
    /**
     * The name of the DynamoDB table.
     * 
     */
    private final String tableName;

    @CustomType.Constructor
    private TopicRuleDynamodbv2PutItem(@CustomType.Parameter("tableName") String tableName) {
        this.tableName = tableName;
    }

    /**
     * The name of the DynamoDB table.
     * 
    */
    public String getTableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDynamodbv2PutItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDynamodbv2PutItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableName = defaults.tableName;
        }

        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public TopicRuleDynamodbv2PutItem build() {
            return new TopicRuleDynamodbv2PutItem(tableName);
        }
    }
}
