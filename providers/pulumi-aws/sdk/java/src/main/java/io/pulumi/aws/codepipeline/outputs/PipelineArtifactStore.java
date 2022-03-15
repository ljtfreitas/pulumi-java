// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codepipeline.outputs;

import io.pulumi.aws.codepipeline.outputs.PipelineArtifactStoreEncryptionKey;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineArtifactStore {
    /**
     * The encryption key block AWS CodePipeline uses to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. If you don't specify a key, AWS CodePipeline uses the default key for Amazon Simple Storage Service (Amazon S3). An `encryption_key` block is documented below.
     * 
     */
    private final @Nullable PipelineArtifactStoreEncryptionKey encryptionKey;
    /**
     * The location where AWS CodePipeline stores artifacts for a pipeline; currently only `S3` is supported.
     * 
     */
    private final String location;
    /**
     * The region where the artifact store is located. Required for a cross-region CodePipeline, do not provide for a single-region CodePipeline.
     * 
     */
    private final @Nullable String region;
    /**
     * The type of the artifact store, such as Amazon S3
     * 
     */
    private final String type;

    @CustomType.Constructor
    private PipelineArtifactStore(
        @CustomType.Parameter("encryptionKey") @Nullable PipelineArtifactStoreEncryptionKey encryptionKey,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("type") String type) {
        this.encryptionKey = encryptionKey;
        this.location = location;
        this.region = region;
        this.type = type;
    }

    /**
     * The encryption key block AWS CodePipeline uses to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. If you don't specify a key, AWS CodePipeline uses the default key for Amazon Simple Storage Service (Amazon S3). An `encryption_key` block is documented below.
     * 
    */
    public Optional<PipelineArtifactStoreEncryptionKey> getEncryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }
    /**
     * The location where AWS CodePipeline stores artifacts for a pipeline; currently only `S3` is supported.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The region where the artifact store is located. Required for a cross-region CodePipeline, do not provide for a single-region CodePipeline.
     * 
    */
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    /**
     * The type of the artifact store, such as Amazon S3
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArtifactStore defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PipelineArtifactStoreEncryptionKey encryptionKey;
        private String location;
        private @Nullable String region;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArtifactStore defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.location = defaults.location;
    	      this.region = defaults.region;
    	      this.type = defaults.type;
        }

        public Builder encryptionKey(@Nullable PipelineArtifactStoreEncryptionKey encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public PipelineArtifactStore build() {
            return new PipelineArtifactStore(encryptionKey, location, region, type);
        }
    }
}
