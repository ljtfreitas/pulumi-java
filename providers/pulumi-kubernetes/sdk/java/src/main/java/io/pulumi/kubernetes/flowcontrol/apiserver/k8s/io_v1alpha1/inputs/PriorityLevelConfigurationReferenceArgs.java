// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * PriorityLevelConfigurationReference contains information that points to the "request-priority" being used.
 * 
 */
public final class PriorityLevelConfigurationReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PriorityLevelConfigurationReferenceArgs Empty = new PriorityLevelConfigurationReferenceArgs();

    /**
     * `name` is the name of the priority level configuration being referenced Required.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public PriorityLevelConfigurationReferenceArgs(Output<String> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PriorityLevelConfigurationReferenceArgs() {
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityLevelConfigurationReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public PriorityLevelConfigurationReferenceArgs build() {
            return new PriorityLevelConfigurationReferenceArgs(name);
        }
    }
}
