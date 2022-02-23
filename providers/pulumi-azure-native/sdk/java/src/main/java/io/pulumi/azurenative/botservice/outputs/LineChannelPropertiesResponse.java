// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.azurenative.botservice.outputs.LineRegistrationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class LineChannelPropertiesResponse {
    /**
     * Callback Url to enter in line registration.
     * 
     */
    private final String callbackUrl;
    /**
     * Whether this channel is validated for the bot
     * 
     */
    private final Boolean isValidated;
    /**
     * The list of line channel registrations
     * 
     */
    private final List<LineRegistrationResponse> lineRegistrations;

    @OutputCustomType.Constructor({"callbackUrl","isValidated","lineRegistrations"})
    private LineChannelPropertiesResponse(
        String callbackUrl,
        Boolean isValidated,
        List<LineRegistrationResponse> lineRegistrations) {
        this.callbackUrl = Objects.requireNonNull(callbackUrl);
        this.isValidated = Objects.requireNonNull(isValidated);
        this.lineRegistrations = Objects.requireNonNull(lineRegistrations);
    }

    /**
     * Callback Url to enter in line registration.
     * 
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }
    /**
     * Whether this channel is validated for the bot
     * 
     */
    public Boolean getIsValidated() {
        return this.isValidated;
    }
    /**
     * The list of line channel registrations
     * 
     */
    public List<LineRegistrationResponse> getLineRegistrations() {
        return this.lineRegistrations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LineChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String callbackUrl;
        private Boolean isValidated;
        private List<LineRegistrationResponse> lineRegistrations;

        public Builder() {
    	      // Empty
        }

        public Builder(LineChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackUrl = defaults.callbackUrl;
    	      this.isValidated = defaults.isValidated;
    	      this.lineRegistrations = defaults.lineRegistrations;
        }

        public Builder setCallbackUrl(String callbackUrl) {
            this.callbackUrl = Objects.requireNonNull(callbackUrl);
            return this;
        }

        public Builder setIsValidated(Boolean isValidated) {
            this.isValidated = Objects.requireNonNull(isValidated);
            return this;
        }

        public Builder setLineRegistrations(List<LineRegistrationResponse> lineRegistrations) {
            this.lineRegistrations = Objects.requireNonNull(lineRegistrations);
            return this;
        }
        public LineChannelPropertiesResponse build() {
            return new LineChannelPropertiesResponse(callbackUrl, isValidated, lineRegistrations);
        }
    }
}
