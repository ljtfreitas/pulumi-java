// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainConfigurationAuthorizerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainConfigurationAuthorizerConfigArgs Empty = new DomainConfigurationAuthorizerConfigArgs();

    @Import(name="allowAuthorizerOverride")
      private final @Nullable Output<Boolean> allowAuthorizerOverride;

    public Output<Boolean> getAllowAuthorizerOverride() {
        return this.allowAuthorizerOverride == null ? Output.empty() : this.allowAuthorizerOverride;
    }

    @Import(name="defaultAuthorizerName")
      private final @Nullable Output<String> defaultAuthorizerName;

    public Output<String> getDefaultAuthorizerName() {
        return this.defaultAuthorizerName == null ? Output.empty() : this.defaultAuthorizerName;
    }

    public DomainConfigurationAuthorizerConfigArgs(
        @Nullable Output<Boolean> allowAuthorizerOverride,
        @Nullable Output<String> defaultAuthorizerName) {
        this.allowAuthorizerOverride = allowAuthorizerOverride;
        this.defaultAuthorizerName = defaultAuthorizerName;
    }

    private DomainConfigurationAuthorizerConfigArgs() {
        this.allowAuthorizerOverride = Output.empty();
        this.defaultAuthorizerName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainConfigurationAuthorizerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowAuthorizerOverride;
        private @Nullable Output<String> defaultAuthorizerName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainConfigurationAuthorizerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAuthorizerOverride = defaults.allowAuthorizerOverride;
    	      this.defaultAuthorizerName = defaults.defaultAuthorizerName;
        }

        public Builder allowAuthorizerOverride(@Nullable Output<Boolean> allowAuthorizerOverride) {
            this.allowAuthorizerOverride = allowAuthorizerOverride;
            return this;
        }

        public Builder allowAuthorizerOverride(@Nullable Boolean allowAuthorizerOverride) {
            this.allowAuthorizerOverride = Output.ofNullable(allowAuthorizerOverride);
            return this;
        }

        public Builder defaultAuthorizerName(@Nullable Output<String> defaultAuthorizerName) {
            this.defaultAuthorizerName = defaultAuthorizerName;
            return this;
        }

        public Builder defaultAuthorizerName(@Nullable String defaultAuthorizerName) {
            this.defaultAuthorizerName = Output.ofNullable(defaultAuthorizerName);
            return this;
        }
        public DomainConfigurationAuthorizerConfigArgs build() {
            return new DomainConfigurationAuthorizerConfigArgs(allowAuthorizerOverride, defaultAuthorizerName);
        }
    }
}
