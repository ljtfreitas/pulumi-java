// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Geo-physical location to run a web test from. You must specify one or more locations for the test to run from.
 * 
 */
public final class WebTestGeolocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebTestGeolocationArgs Empty = new WebTestGeolocationArgs();

    /**
     * Location ID for the webtest to run from.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    public WebTestGeolocationArgs(@Nullable Output<String> location) {
        this.location = location;
    }

    private WebTestGeolocationArgs() {
        this.location = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebTestGeolocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;

        public Builder() {
    	      // Empty
        }

        public Builder(WebTestGeolocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public WebTestGeolocationArgs build() {
            return new WebTestGeolocationArgs(location);
        }
    }
}
