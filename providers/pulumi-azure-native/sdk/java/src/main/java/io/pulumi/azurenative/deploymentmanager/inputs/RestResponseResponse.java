// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.RestResponseResponseRegex;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that make up the expected REST response
 * 
 */
public final class RestResponseResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestResponseResponse Empty = new RestResponseResponse();

    /**
     * The regular expressions to match the response content with.
     * 
     */
    @Import(name="regex")
      private final @Nullable RestResponseResponseRegex regex;

    public Optional<RestResponseResponseRegex> getRegex() {
        return this.regex == null ? Optional.empty() : Optional.ofNullable(this.regex);
    }

    /**
     * The HTTP status codes expected in a successful health check response. The response is expected to match one of the given status codes. If no expected status codes are provided, default expected status code is 200 OK.
     * 
     */
    @Import(name="successStatusCodes")
      private final @Nullable List<String> successStatusCodes;

    public List<String> getSuccessStatusCodes() {
        return this.successStatusCodes == null ? List.of() : this.successStatusCodes;
    }

    public RestResponseResponse(
        @Nullable RestResponseResponseRegex regex,
        @Nullable List<String> successStatusCodes) {
        this.regex = regex;
        this.successStatusCodes = successStatusCodes;
    }

    private RestResponseResponse() {
        this.regex = null;
        this.successStatusCodes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RestResponseResponseRegex regex;
        private @Nullable List<String> successStatusCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(RestResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
    	      this.successStatusCodes = defaults.successStatusCodes;
        }

        public Builder regex(@Nullable RestResponseResponseRegex regex) {
            this.regex = regex;
            return this;
        }

        public Builder successStatusCodes(@Nullable List<String> successStatusCodes) {
            this.successStatusCodes = successStatusCodes;
            return this;
        }
        public RestResponseResponse build() {
            return new RestResponseResponse(regex, successStatusCodes);
        }
    }
}
