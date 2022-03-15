// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse {
    /**
     * The human-readable name of the phrase matcher.
     * 
     */
    private final String displayName;
    /**
     * The unique identifier (the resource name) of the phrase matcher.
     * 
     */
    private final String phraseMatcher;

    @CustomType.Constructor
    private GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("phraseMatcher") String phraseMatcher) {
        this.displayName = displayName;
        this.phraseMatcher = phraseMatcher;
    }

    /**
     * The human-readable name of the phrase matcher.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The unique identifier (the resource name) of the phrase matcher.
     * 
    */
    public String getPhraseMatcher() {
        return this.phraseMatcher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String phraseMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.phraseMatcher = defaults.phraseMatcher;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder phraseMatcher(String phraseMatcher) {
            this.phraseMatcher = Objects.requireNonNull(phraseMatcher);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse(displayName, phraseMatcher);
        }
    }
}
