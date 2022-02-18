// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Geo-physical location to run a web test from. You must specify one or more locations for the test to run from.
 * 
 */
public final class WebTestGeolocationResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebTestGeolocationResponse Empty = new WebTestGeolocationResponse();

    /**
     * Location ID for the webtest to run from.
     * 
     */
    @InputImport(name="location")
    private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    public WebTestGeolocationResponse(@Nullable String location) {
        this.location = location;
    }

    private WebTestGeolocationResponse() {
        this.location = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebTestGeolocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String location;

        public Builder() {
    	      // Empty
        }

        public Builder(WebTestGeolocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public WebTestGeolocationResponse build() {
            return new WebTestGeolocationResponse(location);
        }
    }
}
