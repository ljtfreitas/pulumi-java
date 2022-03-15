// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UrlRewriteActionParametersResponse {
    /**
     * Define the relative URL to which the above requests will be rewritten by.
     * 
     */
    private final String destination;
    private final String odataType;
    /**
     * Whether to preserve unmatched path. Default value is true.
     * 
     */
    private final @Nullable Boolean preserveUnmatchedPath;
    /**
     * define a request URI pattern that identifies the type of requests that may be rewritten. If value is blank, all strings are matched.
     * 
     */
    private final String sourcePattern;

    @CustomType.Constructor
    private UrlRewriteActionParametersResponse(
        @CustomType.Parameter("destination") String destination,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("preserveUnmatchedPath") @Nullable Boolean preserveUnmatchedPath,
        @CustomType.Parameter("sourcePattern") String sourcePattern) {
        this.destination = destination;
        this.odataType = odataType;
        this.preserveUnmatchedPath = preserveUnmatchedPath;
        this.sourcePattern = sourcePattern;
    }

    /**
     * Define the relative URL to which the above requests will be rewritten by.
     * 
    */
    public String getDestination() {
        return this.destination;
    }
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Whether to preserve unmatched path. Default value is true.
     * 
    */
    public Optional<Boolean> getPreserveUnmatchedPath() {
        return Optional.ofNullable(this.preserveUnmatchedPath);
    }
    /**
     * define a request URI pattern that identifies the type of requests that may be rewritten. If value is blank, all strings are matched.
     * 
    */
    public String getSourcePattern() {
        return this.sourcePattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlRewriteActionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destination;
        private String odataType;
        private @Nullable Boolean preserveUnmatchedPath;
        private String sourcePattern;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlRewriteActionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.odataType = defaults.odataType;
    	      this.preserveUnmatchedPath = defaults.preserveUnmatchedPath;
    	      this.sourcePattern = defaults.sourcePattern;
        }

        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder preserveUnmatchedPath(@Nullable Boolean preserveUnmatchedPath) {
            this.preserveUnmatchedPath = preserveUnmatchedPath;
            return this;
        }

        public Builder sourcePattern(String sourcePattern) {
            this.sourcePattern = Objects.requireNonNull(sourcePattern);
            return this;
        }
        public UrlRewriteActionParametersResponse build() {
            return new UrlRewriteActionParametersResponse(destination, odataType, preserveUnmatchedPath, sourcePattern);
        }
    }
}
