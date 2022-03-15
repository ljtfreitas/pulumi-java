// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterParameterGroupParameterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterParameterGroupParameterGetArgs Empty = new ClusterParameterGroupParameterGetArgs();

    /**
     * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
     * 
     */
    @Import(name="applyMethod")
      private final @Nullable Output<String> applyMethod;

    public Output<String> getApplyMethod() {
        return this.applyMethod == null ? Output.empty() : this.applyMethod;
    }

    /**
     * The name of the neptune parameter.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The value of the neptune parameter.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public ClusterParameterGroupParameterGetArgs(
        @Nullable Output<String> applyMethod,
        Output<String> name,
        Output<String> value) {
        this.applyMethod = applyMethod;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ClusterParameterGroupParameterGetArgs() {
        this.applyMethod = Output.empty();
        this.name = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterParameterGroupParameterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applyMethod;
        private Output<String> name;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterParameterGroupParameterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyMethod = defaults.applyMethod;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder applyMethod(@Nullable Output<String> applyMethod) {
            this.applyMethod = applyMethod;
            return this;
        }

        public Builder applyMethod(@Nullable String applyMethod) {
            this.applyMethod = Output.ofNullable(applyMethod);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
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
        public ClusterParameterGroupParameterGetArgs build() {
            return new ClusterParameterGroupParameterGetArgs(applyMethod, name, value);
        }
    }
}
