// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BlobShareResponse {
    /**
     * SAS URI of Azure Storage Account Container.
     * 
     */
    private final String sasUri;

    @OutputCustomType.Constructor({"sasUri"})
    private BlobShareResponse(String sasUri) {
        this.sasUri = Objects.requireNonNull(sasUri);
    }

    /**
     * SAS URI of Azure Storage Account Container.
     * 
     */
    public String getSasUri() {
        return this.sasUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobShareResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sasUri;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobShareResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasUri = defaults.sasUri;
        }

        public Builder setSasUri(String sasUri) {
            this.sasUri = Objects.requireNonNull(sasUri);
            return this;
        }

        public BlobShareResponse build() {
            return new BlobShareResponse(sasUri);
        }
    }
}
