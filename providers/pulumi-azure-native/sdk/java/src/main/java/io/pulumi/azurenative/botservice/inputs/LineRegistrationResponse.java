// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties corresponding to a line channel registration
 * 
 */
public final class LineRegistrationResponse extends io.pulumi.resources.InvokeArgs {

    public static final LineRegistrationResponse Empty = new LineRegistrationResponse();

    /**
     * Access token for the line channel registration
     * 
     */
    @InputImport(name="channelAccessToken")
        private final @Nullable String channelAccessToken;

    public Optional<String> getChannelAccessToken() {
        return this.channelAccessToken == null ? Optional.empty() : Optional.ofNullable(this.channelAccessToken);
    }

    /**
     * Secret for the line channel registration
     * 
     */
    @InputImport(name="channelSecret")
        private final @Nullable String channelSecret;

    public Optional<String> getChannelSecret() {
        return this.channelSecret == null ? Optional.empty() : Optional.ofNullable(this.channelSecret);
    }

    /**
     * Id generated for the line channel registration
     * 
     */
    @InputImport(name="generatedId", required=true)
        private final String generatedId;

    public String getGeneratedId() {
        return this.generatedId;
    }

    public LineRegistrationResponse(
        @Nullable String channelAccessToken,
        @Nullable String channelSecret,
        String generatedId) {
        this.channelAccessToken = channelAccessToken;
        this.channelSecret = channelSecret;
        this.generatedId = Objects.requireNonNull(generatedId, "expected parameter 'generatedId' to be non-null");
    }

    private LineRegistrationResponse() {
        this.channelAccessToken = null;
        this.channelSecret = null;
        this.generatedId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LineRegistrationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String channelAccessToken;
        private @Nullable String channelSecret;
        private String generatedId;

        public Builder() {
    	      // Empty
        }

        public Builder(LineRegistrationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelAccessToken = defaults.channelAccessToken;
    	      this.channelSecret = defaults.channelSecret;
    	      this.generatedId = defaults.generatedId;
        }

        public Builder setChannelAccessToken(@Nullable String channelAccessToken) {
            this.channelAccessToken = channelAccessToken;
            return this;
        }

        public Builder setChannelSecret(@Nullable String channelSecret) {
            this.channelSecret = channelSecret;
            return this;
        }

        public Builder setGeneratedId(String generatedId) {
            this.generatedId = Objects.requireNonNull(generatedId);
            return this;
        }
        public LineRegistrationResponse build() {
            return new LineRegistrationResponse(channelAccessToken, channelSecret, generatedId);
        }
    }
}
