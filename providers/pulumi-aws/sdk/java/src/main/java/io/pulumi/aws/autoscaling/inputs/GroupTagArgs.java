// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GroupTagArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupTagArgs Empty = new GroupTagArgs();

    /**
     * Key
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * Enables propagation of the tag to
     * Amazon EC2 instances launched via this ASG
     * 
     */
    @Import(name="propagateAtLaunch", required=true)
      private final Output<Boolean> propagateAtLaunch;

    public Output<Boolean> getPropagateAtLaunch() {
        return this.propagateAtLaunch;
    }

    /**
     * Value
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public GroupTagArgs(
        Output<String> key,
        Output<Boolean> propagateAtLaunch,
        Output<String> value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.propagateAtLaunch = Objects.requireNonNull(propagateAtLaunch, "expected parameter 'propagateAtLaunch' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GroupTagArgs() {
        this.key = Output.empty();
        this.propagateAtLaunch = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private Output<Boolean> propagateAtLaunch;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupTagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.propagateAtLaunch = defaults.propagateAtLaunch;
    	      this.value = defaults.value;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder propagateAtLaunch(Output<Boolean> propagateAtLaunch) {
            this.propagateAtLaunch = Objects.requireNonNull(propagateAtLaunch);
            return this;
        }

        public Builder propagateAtLaunch(Boolean propagateAtLaunch) {
            this.propagateAtLaunch = Output.of(Objects.requireNonNull(propagateAtLaunch));
            return this;
        }

        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }
        public GroupTagArgs build() {
            return new GroupTagArgs(key, propagateAtLaunch, value);
        }
    }
}
