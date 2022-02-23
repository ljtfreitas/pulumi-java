// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GuestPoliciesRecipeInstallStepArchiveExtraction {
    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    private final String artifactId;
    /**
     * Directory to extract archive to. Defaults to / on Linux or C:\ on Windows.
     * 
     */
    private final @Nullable String destination;
    /**
     * The type of the archive to extract.
     * Possible values are `TAR`, `TAR_GZIP`, `TAR_BZIP`, `TAR_LZMA`, `TAR_XZ`, and `ZIP`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"artifactId","destination","type"})
    private GuestPoliciesRecipeInstallStepArchiveExtraction(
        String artifactId,
        @Nullable String destination,
        String type) {
        this.artifactId = Objects.requireNonNull(artifactId);
        this.destination = destination;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    public String getArtifactId() {
        return this.artifactId;
    }
    /**
     * Directory to extract archive to. Defaults to / on Linux or C:\ on Windows.
     * 
     */
    public Optional<String> getDestination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * The type of the archive to extract.
     * Possible values are `TAR`, `TAR_GZIP`, `TAR_BZIP`, `TAR_LZMA`, `TAR_XZ`, and `ZIP`.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeInstallStepArchiveExtraction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactId;
        private @Nullable String destination;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeInstallStepArchiveExtraction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
    	      this.destination = defaults.destination;
    	      this.type = defaults.type;
        }

        public Builder setArtifactId(String artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }

        public Builder setDestination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GuestPoliciesRecipeInstallStepArchiveExtraction build() {
            return new GuestPoliciesRecipeInstallStepArchiveExtraction(artifactId, destination, type);
        }
    }
}
