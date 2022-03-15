// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.TopicRulePutItemInputArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleDynamoDBv2ActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleDynamoDBv2ActionArgs Empty = new TopicRuleDynamoDBv2ActionArgs();

    @Import(name="putItem")
      private final @Nullable Output<TopicRulePutItemInputArgs> putItem;

    public Output<TopicRulePutItemInputArgs> getPutItem() {
        return this.putItem == null ? Output.empty() : this.putItem;
    }

    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    public TopicRuleDynamoDBv2ActionArgs(
        @Nullable Output<TopicRulePutItemInputArgs> putItem,
        @Nullable Output<String> roleArn) {
        this.putItem = putItem;
        this.roleArn = roleArn;
    }

    private TopicRuleDynamoDBv2ActionArgs() {
        this.putItem = Output.empty();
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDynamoDBv2ActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TopicRulePutItemInputArgs> putItem;
        private @Nullable Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDynamoDBv2ActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.putItem = defaults.putItem;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder putItem(@Nullable Output<TopicRulePutItemInputArgs> putItem) {
            this.putItem = putItem;
            return this;
        }

        public Builder putItem(@Nullable TopicRulePutItemInputArgs putItem) {
            this.putItem = Output.ofNullable(putItem);
            return this;
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
            return this;
        }
        public TopicRuleDynamoDBv2ActionArgs build() {
            return new TopicRuleDynamoDBv2ActionArgs(putItem, roleArn);
        }
    }
}
