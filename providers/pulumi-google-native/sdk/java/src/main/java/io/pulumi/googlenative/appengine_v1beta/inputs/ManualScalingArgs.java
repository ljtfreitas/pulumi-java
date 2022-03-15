// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
 * 
 */
public final class ManualScalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManualScalingArgs Empty = new ManualScalingArgs();

    /**
     * Number of instances to assign to the service at the start. This number can later be altered by using the Modules API (https://cloud.google.com/appengine/docs/python/modules/functions) set_num_instances() function.
     * 
     */
    @Import(name="instances")
      private final @Nullable Output<Integer> instances;

    public Output<Integer> getInstances() {
        return this.instances == null ? Output.empty() : this.instances;
    }

    public ManualScalingArgs(@Nullable Output<Integer> instances) {
        this.instances = instances;
    }

    private ManualScalingArgs() {
        this.instances = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManualScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> instances;

        public Builder() {
    	      // Empty
        }

        public Builder(ManualScalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
        }

        public Builder instances(@Nullable Output<Integer> instances) {
            this.instances = instances;
            return this;
        }

        public Builder instances(@Nullable Integer instances) {
            this.instances = Output.ofNullable(instances);
            return this;
        }
        public ManualScalingArgs build() {
            return new ManualScalingArgs(instances);
        }
    }
}
