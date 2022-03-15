// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
 * 
 */
public final class BasicScalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BasicScalingArgs Empty = new BasicScalingArgs();

    /**
     * Duration of time after the last request that an instance must wait before the instance is shut down.
     * 
     */
    @Import(name="idleTimeout")
      private final @Nullable Output<String> idleTimeout;

    public Output<String> getIdleTimeout() {
        return this.idleTimeout == null ? Output.empty() : this.idleTimeout;
    }

    /**
     * Maximum number of instances to create for this version.
     * 
     */
    @Import(name="maxInstances")
      private final @Nullable Output<Integer> maxInstances;

    public Output<Integer> getMaxInstances() {
        return this.maxInstances == null ? Output.empty() : this.maxInstances;
    }

    public BasicScalingArgs(
        @Nullable Output<String> idleTimeout,
        @Nullable Output<Integer> maxInstances) {
        this.idleTimeout = idleTimeout;
        this.maxInstances = maxInstances;
    }

    private BasicScalingArgs() {
        this.idleTimeout = Output.empty();
        this.maxInstances = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> idleTimeout;
        private @Nullable Output<Integer> maxInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicScalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.maxInstances = defaults.maxInstances;
        }

        public Builder idleTimeout(@Nullable Output<String> idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        public Builder idleTimeout(@Nullable String idleTimeout) {
            this.idleTimeout = Output.ofNullable(idleTimeout);
            return this;
        }

        public Builder maxInstances(@Nullable Output<Integer> maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }

        public Builder maxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = Output.ofNullable(maxInstances);
            return this;
        }
        public BasicScalingArgs build() {
            return new BasicScalingArgs(idleTimeout, maxInstances);
        }
    }
}
