// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.ml_v1.enums.GoogleCloudMlV1__MetricSpecName;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MetricSpec contains the specifications to use to calculate the desired nodes count when autoscaling is enabled.
 * 
 */
public final class GoogleCloudMlV1__MetricSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__MetricSpecArgs Empty = new GoogleCloudMlV1__MetricSpecArgs();

    /**
     * metric name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<GoogleCloudMlV1__MetricSpecName> name;

    public Output<GoogleCloudMlV1__MetricSpecName> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Target specifies the target value for the given metric; once real metric deviates from the threshold by a certain percentage, the node count changes.
     * 
     */
    @Import(name="target")
      private final @Nullable Output<Integer> target;

    public Output<Integer> getTarget() {
        return this.target == null ? Output.empty() : this.target;
    }

    public GoogleCloudMlV1__MetricSpecArgs(
        @Nullable Output<GoogleCloudMlV1__MetricSpecName> name,
        @Nullable Output<Integer> target) {
        this.name = name;
        this.target = target;
    }

    private GoogleCloudMlV1__MetricSpecArgs() {
        this.name = Output.empty();
        this.target = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__MetricSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudMlV1__MetricSpecName> name;
        private @Nullable Output<Integer> target;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__MetricSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.target = defaults.target;
        }

        public Builder name(@Nullable Output<GoogleCloudMlV1__MetricSpecName> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable GoogleCloudMlV1__MetricSpecName name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder target(@Nullable Output<Integer> target) {
            this.target = target;
            return this;
        }

        public Builder target(@Nullable Integer target) {
            this.target = Output.ofNullable(target);
            return this;
        }
        public GoogleCloudMlV1__MetricSpecArgs build() {
            return new GoogleCloudMlV1__MetricSpecArgs(name, target);
        }
    }
}
