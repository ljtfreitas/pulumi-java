// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageTemplateFileCustomizerResponse {
    /**
     * The absolute path to a file (with nested directory structures already created) where the file (from sourceUri) will be uploaded to in the VM
     * 
     */
    private final @Nullable String destination;
    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    private final @Nullable String name;
    /**
     * SHA256 checksum of the file provided in the sourceUri field above
     * 
     */
    private final @Nullable String sha256Checksum;
    /**
     * The URI of the file to be uploaded for customizing the VM. It can be a github link, SAS URI for Azure Storage, etc
     * 
     */
    private final @Nullable String sourceUri;
    /**
     * The type of customization tool you want to use on the Image. For example, "Shell" can be shell customizer
     * Expected value is 'File'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"destination","name","sha256Checksum","sourceUri","type"})
    private ImageTemplateFileCustomizerResponse(
        @Nullable String destination,
        @Nullable String name,
        @Nullable String sha256Checksum,
        @Nullable String sourceUri,
        String type) {
        this.destination = destination;
        this.name = name;
        this.sha256Checksum = sha256Checksum;
        this.sourceUri = sourceUri;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The absolute path to a file (with nested directory structures already created) where the file (from sourceUri) will be uploaded to in the VM
     * 
     */
    public Optional<String> getDestination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * SHA256 checksum of the file provided in the sourceUri field above
     * 
     */
    public Optional<String> getSha256Checksum() {
        return Optional.ofNullable(this.sha256Checksum);
    }
    /**
     * The URI of the file to be uploaded for customizing the VM. It can be a github link, SAS URI for Azure Storage, etc
     * 
     */
    public Optional<String> getSourceUri() {
        return Optional.ofNullable(this.sourceUri);
    }
    /**
     * The type of customization tool you want to use on the Image. For example, "Shell" can be shell customizer
     * Expected value is 'File'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateFileCustomizerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destination;
        private @Nullable String name;
        private @Nullable String sha256Checksum;
        private @Nullable String sourceUri;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateFileCustomizerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.name = defaults.name;
    	      this.sha256Checksum = defaults.sha256Checksum;
    	      this.sourceUri = defaults.sourceUri;
    	      this.type = defaults.type;
        }

        public Builder setDestination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSha256Checksum(@Nullable String sha256Checksum) {
            this.sha256Checksum = sha256Checksum;
            return this;
        }

        public Builder setSourceUri(@Nullable String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ImageTemplateFileCustomizerResponse build() {
            return new ImageTemplateFileCustomizerResponse(destination, name, sha256Checksum, sourceUri, type);
        }
    }
}
