// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ConsoleProfile represents a console profile.
 * 
 */
public final class ConsoleProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConsoleProfileResponse Empty = new ConsoleProfileResponse();

    /**
     * The URL to access the cluster console (immutable).
     * 
     */
    @Import(name="url")
      private final @Nullable String url;

    public Optional<String> getUrl() {
        return this.url == null ? Optional.empty() : Optional.ofNullable(this.url);
    }

    public ConsoleProfileResponse(@Nullable String url) {
        this.url = url;
    }

    private ConsoleProfileResponse() {
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsoleProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsoleProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        public ConsoleProfileResponse build() {
            return new ConsoleProfileResponse(url);
        }
    }
}
