// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceConvergeConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceConvergeConfigArgs Empty = new ServiceConvergeConfigArgs();

    @Import(name="delay")
      private final @Nullable Output<String> delay;

    public Output<String> getDelay() {
        return this.delay == null ? Output.empty() : this.delay;
    }

    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    public ServiceConvergeConfigArgs(
        @Nullable Output<String> delay,
        @Nullable Output<String> timeout) {
        this.delay = delay;
        this.timeout = timeout;
    }

    private ServiceConvergeConfigArgs() {
        this.delay = Output.empty();
        this.timeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceConvergeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> delay;
        private @Nullable Output<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceConvergeConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delay = defaults.delay;
    	      this.timeout = defaults.timeout;
        }

        public Builder delay(@Nullable Output<String> delay) {
            this.delay = delay;
            return this;
        }

        public Builder delay(@Nullable String delay) {
            this.delay = Output.ofNullable(delay);
            return this;
        }

        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable String timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }
        public ServiceConvergeConfigArgs build() {
            return new ServiceConvergeConfigArgs(delay, timeout);
        }
    }
}
