// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceLogConfigArgs Empty = new EdgeCacheServiceLogConfigArgs();

    /**
     * Specifies whether to enable logging for traffic served by this service.
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<Boolean> enable;

    public Output<Boolean> enable() {
        return this.enable == null ? Codegen.empty() : this.enable;
    }

    /**
     * Configures the sampling rate of requests, where 1.0 means all logged requests are reported and 0.0 means no logged requests are reported. The default value is 1.0, and the value of the field must be in [0, 1].
     * This field can only be specified if logging is enabled for this service.
     * 
     */
    @Import(name="sampleRate")
      private final @Nullable Output<Double> sampleRate;

    public Output<Double> sampleRate() {
        return this.sampleRate == null ? Codegen.empty() : this.sampleRate;
    }

    public EdgeCacheServiceLogConfigArgs(
        @Nullable Output<Boolean> enable,
        @Nullable Output<Double> sampleRate) {
        this.enable = enable;
        this.sampleRate = sampleRate;
    }

    private EdgeCacheServiceLogConfigArgs() {
        this.enable = Codegen.empty();
        this.sampleRate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enable;
        private @Nullable Output<Double> sampleRate;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.sampleRate = defaults.sampleRate;
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            this.enable = enable;
            return this;
        }
        public Builder enable(@Nullable Boolean enable) {
            this.enable = Codegen.ofNullable(enable);
            return this;
        }
        public Builder sampleRate(@Nullable Output<Double> sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Builder sampleRate(@Nullable Double sampleRate) {
            this.sampleRate = Codegen.ofNullable(sampleRate);
            return this;
        }        public EdgeCacheServiceLogConfigArgs build() {
            return new EdgeCacheServiceLogConfigArgs(enable, sampleRate);
        }
    }
}
