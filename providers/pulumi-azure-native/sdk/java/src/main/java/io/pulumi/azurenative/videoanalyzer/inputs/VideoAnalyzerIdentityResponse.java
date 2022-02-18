// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.inputs.UserAssignedManagedIdentityResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The managed identity for the Video Analyzer resource.
 * 
 */
public final class VideoAnalyzerIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final VideoAnalyzerIdentityResponse Empty = new VideoAnalyzerIdentityResponse();

    /**
     * The identity type.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The User Assigned Managed Identities.
     * 
     */
    @InputImport(name="userAssignedIdentities")
    private final @Nullable Map<String,UserAssignedManagedIdentityResponse> userAssignedIdentities;

    public Map<String,UserAssignedManagedIdentityResponse> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public VideoAnalyzerIdentityResponse(
        String type,
        @Nullable Map<String,UserAssignedManagedIdentityResponse> userAssignedIdentities) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private VideoAnalyzerIdentityResponse() {
        this.type = null;
        this.userAssignedIdentities = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoAnalyzerIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private @Nullable Map<String,UserAssignedManagedIdentityResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoAnalyzerIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,UserAssignedManagedIdentityResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public VideoAnalyzerIdentityResponse build() {
            return new VideoAnalyzerIdentityResponse(type, userAssignedIdentities);
        }
    }
}
