// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cross-Origin Resource Sharing (CORS) settings.
 * 
 */
public final class SignalRCorsSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SignalRCorsSettingsResponse Empty = new SignalRCorsSettingsResponse();

    /**
     * Gets or sets the list of origins that should be allowed to make cross-origin calls (for example: http://example.com:12345). Use "*" to allow all. If omitted, allow all by default.
     * 
     */
    @Import(name="allowedOrigins")
      private final @Nullable List<String> allowedOrigins;

    public List<String> getAllowedOrigins() {
        return this.allowedOrigins == null ? List.of() : this.allowedOrigins;
    }

    public SignalRCorsSettingsResponse(@Nullable List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    private SignalRCorsSettingsResponse() {
        this.allowedOrigins = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignalRCorsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedOrigins;

        public Builder() {
    	      // Empty
        }

        public Builder(SignalRCorsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOrigins = defaults.allowedOrigins;
        }

        public Builder allowedOrigins(@Nullable List<String> allowedOrigins) {
            this.allowedOrigins = allowedOrigins;
            return this;
        }
        public SignalRCorsSettingsResponse build() {
            return new SignalRCorsSettingsResponse(allowedOrigins);
        }
    }
}
