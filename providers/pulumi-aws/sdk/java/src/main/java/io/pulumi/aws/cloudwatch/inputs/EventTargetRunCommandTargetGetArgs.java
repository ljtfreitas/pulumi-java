// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class EventTargetRunCommandTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetRunCommandTargetGetArgs Empty = new EventTargetRunCommandTargetGetArgs();

    /**
     * Can be either `tag:tag-key` or `InstanceIds`.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * If Key is `tag:tag-key`, Values is a list of tag values. If Key is `InstanceIds`, Values is a list of Amazon EC2 instance IDs.
     * 
     */
    @Import(name="values", required=true)
      private final Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values;
    }

    public EventTargetRunCommandTargetGetArgs(
        Output<String> key,
        Output<List<String>> values) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private EventTargetRunCommandTargetGetArgs() {
        this.key = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetRunCommandTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetRunCommandTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder values(Output<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Output.of(Objects.requireNonNull(values));
            return this;
        }
        public EventTargetRunCommandTargetGetArgs build() {
            return new EventTargetRunCommandTargetGetArgs(key, values);
        }
    }
}
