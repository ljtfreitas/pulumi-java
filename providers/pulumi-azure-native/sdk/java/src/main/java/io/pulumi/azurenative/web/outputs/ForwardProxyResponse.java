// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ForwardProxyResponse {
    /**
     * The convention used to determine the url of the request made.
     * 
     */
    private final @Nullable String convention;
    /**
     * The name of the header containing the host of the request.
     * 
     */
    private final @Nullable String customHostHeaderName;
    /**
     * The name of the header containing the scheme of the request.
     * 
     */
    private final @Nullable String customProtoHeaderName;

    @OutputCustomType.Constructor({"convention","customHostHeaderName","customProtoHeaderName"})
    private ForwardProxyResponse(
        @Nullable String convention,
        @Nullable String customHostHeaderName,
        @Nullable String customProtoHeaderName) {
        this.convention = convention;
        this.customHostHeaderName = customHostHeaderName;
        this.customProtoHeaderName = customProtoHeaderName;
    }

    /**
     * The convention used to determine the url of the request made.
     * 
     */
    public Optional<String> getConvention() {
        return Optional.ofNullable(this.convention);
    }
    /**
     * The name of the header containing the host of the request.
     * 
     */
    public Optional<String> getCustomHostHeaderName() {
        return Optional.ofNullable(this.customHostHeaderName);
    }
    /**
     * The name of the header containing the scheme of the request.
     * 
     */
    public Optional<String> getCustomProtoHeaderName() {
        return Optional.ofNullable(this.customProtoHeaderName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardProxyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String convention;
        private @Nullable String customHostHeaderName;
        private @Nullable String customProtoHeaderName;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardProxyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.convention = defaults.convention;
    	      this.customHostHeaderName = defaults.customHostHeaderName;
    	      this.customProtoHeaderName = defaults.customProtoHeaderName;
        }

        public Builder setConvention(@Nullable String convention) {
            this.convention = convention;
            return this;
        }

        public Builder setCustomHostHeaderName(@Nullable String customHostHeaderName) {
            this.customHostHeaderName = customHostHeaderName;
            return this;
        }

        public Builder setCustomProtoHeaderName(@Nullable String customProtoHeaderName) {
            this.customProtoHeaderName = customProtoHeaderName;
            return this;
        }

        public ForwardProxyResponse build() {
            return new ForwardProxyResponse(convention, customHostHeaderName, customProtoHeaderName);
        }
    }
}
