// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyStrictTransportSecurityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyStrictTransportSecurityArgs Empty = new ResponseHeadersPolicyStrictTransportSecurityArgs();

    @Import(name="accessControlMaxAgeSec", required=true)
      private final Output<Integer> accessControlMaxAgeSec;

    public Output<Integer> getAccessControlMaxAgeSec() {
        return this.accessControlMaxAgeSec;
    }

    @Import(name="includeSubdomains")
      private final @Nullable Output<Boolean> includeSubdomains;

    public Output<Boolean> getIncludeSubdomains() {
        return this.includeSubdomains == null ? Output.empty() : this.includeSubdomains;
    }

    @Import(name="override", required=true)
      private final Output<Boolean> override;

    public Output<Boolean> getOverride() {
        return this.override;
    }

    @Import(name="preload")
      private final @Nullable Output<Boolean> preload;

    public Output<Boolean> getPreload() {
        return this.preload == null ? Output.empty() : this.preload;
    }

    public ResponseHeadersPolicyStrictTransportSecurityArgs(
        Output<Integer> accessControlMaxAgeSec,
        @Nullable Output<Boolean> includeSubdomains,
        Output<Boolean> override,
        @Nullable Output<Boolean> preload) {
        this.accessControlMaxAgeSec = Objects.requireNonNull(accessControlMaxAgeSec, "expected parameter 'accessControlMaxAgeSec' to be non-null");
        this.includeSubdomains = includeSubdomains;
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
        this.preload = preload;
    }

    private ResponseHeadersPolicyStrictTransportSecurityArgs() {
        this.accessControlMaxAgeSec = Output.empty();
        this.includeSubdomains = Output.empty();
        this.override = Output.empty();
        this.preload = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyStrictTransportSecurityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> accessControlMaxAgeSec;
        private @Nullable Output<Boolean> includeSubdomains;
        private Output<Boolean> override;
        private @Nullable Output<Boolean> preload;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyStrictTransportSecurityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlMaxAgeSec = defaults.accessControlMaxAgeSec;
    	      this.includeSubdomains = defaults.includeSubdomains;
    	      this.override = defaults.override;
    	      this.preload = defaults.preload;
        }

        public Builder accessControlMaxAgeSec(Output<Integer> accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = Objects.requireNonNull(accessControlMaxAgeSec);
            return this;
        }

        public Builder accessControlMaxAgeSec(Integer accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = Output.of(Objects.requireNonNull(accessControlMaxAgeSec));
            return this;
        }

        public Builder includeSubdomains(@Nullable Output<Boolean> includeSubdomains) {
            this.includeSubdomains = includeSubdomains;
            return this;
        }

        public Builder includeSubdomains(@Nullable Boolean includeSubdomains) {
            this.includeSubdomains = Output.ofNullable(includeSubdomains);
            return this;
        }

        public Builder override(Output<Boolean> override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }

        public Builder override(Boolean override) {
            this.override = Output.of(Objects.requireNonNull(override));
            return this;
        }

        public Builder preload(@Nullable Output<Boolean> preload) {
            this.preload = preload;
            return this;
        }

        public Builder preload(@Nullable Boolean preload) {
            this.preload = Output.ofNullable(preload);
            return this;
        }
        public ResponseHeadersPolicyStrictTransportSecurityArgs build() {
            return new ResponseHeadersPolicyStrictTransportSecurityArgs(accessControlMaxAgeSec, includeSubdomains, override, preload);
        }
    }
}
