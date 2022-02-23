// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Distribute via VHD in a storage account.
 * 
 */
public final class ImageTemplateVhdDistributorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageTemplateVhdDistributorArgs Empty = new ImageTemplateVhdDistributorArgs();

    /**
     * Tags that will be applied to the artifact once it has been created/updated by the distributor.
     * 
     */
    @InputImport(name="artifactTags")
        private final @Nullable Input<Map<String,String>> artifactTags;

    public Input<Map<String,String>> getArtifactTags() {
        return this.artifactTags == null ? Input.empty() : this.artifactTags;
    }

    /**
     * The name to be used for the associated RunOutput.
     * 
     */
    @InputImport(name="runOutputName", required=true)
        private final Input<String> runOutputName;

    public Input<String> getRunOutputName() {
        return this.runOutputName;
    }

    /**
     * Type of distribution.
     * Expected value is 'VHD'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ImageTemplateVhdDistributorArgs(
        @Nullable Input<Map<String,String>> artifactTags,
        Input<String> runOutputName,
        Input<String> type) {
        this.artifactTags = artifactTags;
        this.runOutputName = Objects.requireNonNull(runOutputName, "expected parameter 'runOutputName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ImageTemplateVhdDistributorArgs() {
        this.artifactTags = Input.empty();
        this.runOutputName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateVhdDistributorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> artifactTags;
        private Input<String> runOutputName;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateVhdDistributorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactTags = defaults.artifactTags;
    	      this.runOutputName = defaults.runOutputName;
    	      this.type = defaults.type;
        }

        public Builder setArtifactTags(@Nullable Input<Map<String,String>> artifactTags) {
            this.artifactTags = artifactTags;
            return this;
        }

        public Builder setArtifactTags(@Nullable Map<String,String> artifactTags) {
            this.artifactTags = Input.ofNullable(artifactTags);
            return this;
        }

        public Builder setRunOutputName(Input<String> runOutputName) {
            this.runOutputName = Objects.requireNonNull(runOutputName);
            return this;
        }

        public Builder setRunOutputName(String runOutputName) {
            this.runOutputName = Input.of(Objects.requireNonNull(runOutputName));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ImageTemplateVhdDistributorArgs build() {
            return new ImageTemplateVhdDistributorArgs(artifactTags, runOutputName, type);
        }
    }
}
