// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The regular expressions to match the response content with.
 * 
 */
public final class RestResponseResponseRegex extends io.pulumi.resources.InvokeArgs {

    public static final RestResponseResponseRegex Empty = new RestResponseResponseRegex();

    /**
     * Indicates whether any or all of the expressions should match with the response content.
     * 
     */
    @InputImport(name="matchQuantifier")
        private final @Nullable String matchQuantifier;

    public Optional<String> getMatchQuantifier() {
        return this.matchQuantifier == null ? Optional.empty() : Optional.ofNullable(this.matchQuantifier);
    }

    /**
     * The list of regular expressions.
     * 
     */
    @InputImport(name="matches")
        private final @Nullable List<String> matches;

    public List<String> getMatches() {
        return this.matches == null ? List.of() : this.matches;
    }

    public RestResponseResponseRegex(
        @Nullable String matchQuantifier,
        @Nullable List<String> matches) {
        this.matchQuantifier = matchQuantifier;
        this.matches = matches;
    }

    private RestResponseResponseRegex() {
        this.matchQuantifier = null;
        this.matches = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestResponseResponseRegex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String matchQuantifier;
        private @Nullable List<String> matches;

        public Builder() {
    	      // Empty
        }

        public Builder(RestResponseResponseRegex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchQuantifier = defaults.matchQuantifier;
    	      this.matches = defaults.matches;
        }

        public Builder setMatchQuantifier(@Nullable String matchQuantifier) {
            this.matchQuantifier = matchQuantifier;
            return this;
        }

        public Builder setMatches(@Nullable List<String> matches) {
            this.matches = matches;
            return this;
        }
        public RestResponseResponseRegex build() {
            return new RestResponseResponseRegex(matchQuantifier, matches);
        }
    }
}
