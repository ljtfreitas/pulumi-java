// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleErrorActionElasticsearchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionElasticsearchGetArgs Empty = new TopicRuleErrorActionElasticsearchGetArgs();

    /**
     * The endpoint of your Elasticsearch domain.
     * 
     */
    @Import(name="endpoint", required=true)
      private final Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint;
    }

    /**
     * The unique identifier for the document you are storing.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * The Elasticsearch index where you want to store your data.
     * 
     */
    @Import(name="index", required=true)
      private final Output<String> index;

    public Output<String> getIndex() {
        return this.index;
    }

    /**
     * The IAM role ARN that has access to Elasticsearch.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * The type of document you are storing.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public TopicRuleErrorActionElasticsearchGetArgs(
        Output<String> endpoint,
        Output<String> id,
        Output<String> index,
        Output<String> roleArn,
        Output<String> type) {
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.index = Objects.requireNonNull(index, "expected parameter 'index' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TopicRuleErrorActionElasticsearchGetArgs() {
        this.endpoint = Output.empty();
        this.id = Output.empty();
        this.index = Output.empty();
        this.roleArn = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionElasticsearchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> endpoint;
        private Output<String> id;
        private Output<String> index;
        private Output<String> roleArn;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionElasticsearchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.index = defaults.index;
    	      this.roleArn = defaults.roleArn;
    	      this.type = defaults.type;
        }

        public Builder endpoint(Output<String> endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Output.of(Objects.requireNonNull(endpoint));
            return this;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder index(Output<String> index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }

        public Builder index(String index) {
            this.index = Output.of(Objects.requireNonNull(index));
            return this;
        }

        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public TopicRuleErrorActionElasticsearchGetArgs build() {
            return new TopicRuleErrorActionElasticsearchGetArgs(endpoint, id, index, roleArn, type);
        }
    }
}
