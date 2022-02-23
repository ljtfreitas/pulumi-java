// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda;

import io.pulumi.core.Archive;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LayerVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final LayerVersionArgs Empty = new LayerVersionArgs();

    /**
     * Path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
     * 
     */
    @InputImport(name="code")
    private final @Nullable Input<Archive> code;

    public Input<Archive> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    /**
     * List of [Architectures](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleArchitectures) this layer is compatible with. Currently `x86_64` and `arm64` can be specified.
     * 
     */
    @InputImport(name="compatibleArchitectures")
    private final @Nullable Input<List<String>> compatibleArchitectures;

    public Input<List<String>> getCompatibleArchitectures() {
        return this.compatibleArchitectures == null ? Input.empty() : this.compatibleArchitectures;
    }

    /**
     * List of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleRuntimes) this layer is compatible with. Up to 5 runtimes can be specified.
     * 
     */
    @InputImport(name="compatibleRuntimes")
    private final @Nullable Input<List<String>> compatibleRuntimes;

    public Input<List<String>> getCompatibleRuntimes() {
        return this.compatibleRuntimes == null ? Input.empty() : this.compatibleRuntimes;
    }

    /**
     * Description of what your Lambda Layer does.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Unique name for your Lambda Layer
     * 
     */
    @InputImport(name="layerName", required=true)
    private final Input<String> layerName;

    public Input<String> getLayerName() {
        return this.layerName;
    }

    /**
     * License info for your Lambda Layer. See [License Info](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-LicenseInfo).
     * 
     */
    @InputImport(name="licenseInfo")
    private final @Nullable Input<String> licenseInfo;

    public Input<String> getLicenseInfo() {
        return this.licenseInfo == null ? Input.empty() : this.licenseInfo;
    }

    /**
     * S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
     * 
     */
    @InputImport(name="s3Bucket")
    private final @Nullable Input<String> s3Bucket;

    public Input<String> getS3Bucket() {
        return this.s3Bucket == null ? Input.empty() : this.s3Bucket;
    }

    /**
     * S3 key of an object containing the function's deployment package. Conflicts with `filename`.
     * 
     */
    @InputImport(name="s3Key")
    private final @Nullable Input<String> s3Key;

    public Input<String> getS3Key() {
        return this.s3Key == null ? Input.empty() : this.s3Key;
    }

    /**
     * Object version containing the function's deployment package. Conflicts with `filename`.
     * 
     */
    @InputImport(name="s3ObjectVersion")
    private final @Nullable Input<String> s3ObjectVersion;

    public Input<String> getS3ObjectVersion() {
        return this.s3ObjectVersion == null ? Input.empty() : this.s3ObjectVersion;
    }

    /**
     * Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_architectures`, `compatible_runtimes`, `description`, `filename`, `layer_name`, `license_info`, `s3_bucket`, `s3_key`, `s3_object_version`, or `source_code_hash` forces deletion of the existing layer version and creation of a new layer version.
     * 
     */
    @InputImport(name="skipDestroy")
    private final @Nullable Input<Boolean> skipDestroy;

    public Input<Boolean> getSkipDestroy() {
        return this.skipDestroy == null ? Input.empty() : this.skipDestroy;
    }

    @InputImport(name="sourceCodeHash")
    private final @Nullable Input<String> sourceCodeHash;

    public Input<String> getSourceCodeHash() {
        return this.sourceCodeHash == null ? Input.empty() : this.sourceCodeHash;
    }

    public LayerVersionArgs(
        @Nullable Input<Archive> code,
        @Nullable Input<List<String>> compatibleArchitectures,
        @Nullable Input<List<String>> compatibleRuntimes,
        @Nullable Input<String> description,
        Input<String> layerName,
        @Nullable Input<String> licenseInfo,
        @Nullable Input<String> s3Bucket,
        @Nullable Input<String> s3Key,
        @Nullable Input<String> s3ObjectVersion,
        @Nullable Input<Boolean> skipDestroy,
        @Nullable Input<String> sourceCodeHash) {
        this.code = code;
        this.compatibleArchitectures = compatibleArchitectures;
        this.compatibleRuntimes = compatibleRuntimes;
        this.description = description;
        this.layerName = Objects.requireNonNull(layerName, "expected parameter 'layerName' to be non-null");
        this.licenseInfo = licenseInfo;
        this.s3Bucket = s3Bucket;
        this.s3Key = s3Key;
        this.s3ObjectVersion = s3ObjectVersion;
        this.skipDestroy = skipDestroy;
        this.sourceCodeHash = sourceCodeHash;
    }

    private LayerVersionArgs() {
        this.code = Input.empty();
        this.compatibleArchitectures = Input.empty();
        this.compatibleRuntimes = Input.empty();
        this.description = Input.empty();
        this.layerName = Input.empty();
        this.licenseInfo = Input.empty();
        this.s3Bucket = Input.empty();
        this.s3Key = Input.empty();
        this.s3ObjectVersion = Input.empty();
        this.skipDestroy = Input.empty();
        this.sourceCodeHash = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LayerVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Archive> code;
        private @Nullable Input<List<String>> compatibleArchitectures;
        private @Nullable Input<List<String>> compatibleRuntimes;
        private @Nullable Input<String> description;
        private Input<String> layerName;
        private @Nullable Input<String> licenseInfo;
        private @Nullable Input<String> s3Bucket;
        private @Nullable Input<String> s3Key;
        private @Nullable Input<String> s3ObjectVersion;
        private @Nullable Input<Boolean> skipDestroy;
        private @Nullable Input<String> sourceCodeHash;

        public Builder() {
    	      // Empty
        }

        public Builder(LayerVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.compatibleArchitectures = defaults.compatibleArchitectures;
    	      this.compatibleRuntimes = defaults.compatibleRuntimes;
    	      this.description = defaults.description;
    	      this.layerName = defaults.layerName;
    	      this.licenseInfo = defaults.licenseInfo;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Key = defaults.s3Key;
    	      this.s3ObjectVersion = defaults.s3ObjectVersion;
    	      this.skipDestroy = defaults.skipDestroy;
    	      this.sourceCodeHash = defaults.sourceCodeHash;
        }

        public Builder setCode(@Nullable Input<Archive> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable Archive code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder setCompatibleArchitectures(@Nullable Input<List<String>> compatibleArchitectures) {
            this.compatibleArchitectures = compatibleArchitectures;
            return this;
        }

        public Builder setCompatibleArchitectures(@Nullable List<String> compatibleArchitectures) {
            this.compatibleArchitectures = Input.ofNullable(compatibleArchitectures);
            return this;
        }

        public Builder setCompatibleRuntimes(@Nullable Input<List<String>> compatibleRuntimes) {
            this.compatibleRuntimes = compatibleRuntimes;
            return this;
        }

        public Builder setCompatibleRuntimes(@Nullable List<String> compatibleRuntimes) {
            this.compatibleRuntimes = Input.ofNullable(compatibleRuntimes);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setLayerName(Input<String> layerName) {
            this.layerName = Objects.requireNonNull(layerName);
            return this;
        }

        public Builder setLayerName(String layerName) {
            this.layerName = Input.of(Objects.requireNonNull(layerName));
            return this;
        }

        public Builder setLicenseInfo(@Nullable Input<String> licenseInfo) {
            this.licenseInfo = licenseInfo;
            return this;
        }

        public Builder setLicenseInfo(@Nullable String licenseInfo) {
            this.licenseInfo = Input.ofNullable(licenseInfo);
            return this;
        }

        public Builder setS3Bucket(@Nullable Input<String> s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }

        public Builder setS3Bucket(@Nullable String s3Bucket) {
            this.s3Bucket = Input.ofNullable(s3Bucket);
            return this;
        }

        public Builder setS3Key(@Nullable Input<String> s3Key) {
            this.s3Key = s3Key;
            return this;
        }

        public Builder setS3Key(@Nullable String s3Key) {
            this.s3Key = Input.ofNullable(s3Key);
            return this;
        }

        public Builder setS3ObjectVersion(@Nullable Input<String> s3ObjectVersion) {
            this.s3ObjectVersion = s3ObjectVersion;
            return this;
        }

        public Builder setS3ObjectVersion(@Nullable String s3ObjectVersion) {
            this.s3ObjectVersion = Input.ofNullable(s3ObjectVersion);
            return this;
        }

        public Builder setSkipDestroy(@Nullable Input<Boolean> skipDestroy) {
            this.skipDestroy = skipDestroy;
            return this;
        }

        public Builder setSkipDestroy(@Nullable Boolean skipDestroy) {
            this.skipDestroy = Input.ofNullable(skipDestroy);
            return this;
        }

        public Builder setSourceCodeHash(@Nullable Input<String> sourceCodeHash) {
            this.sourceCodeHash = sourceCodeHash;
            return this;
        }

        public Builder setSourceCodeHash(@Nullable String sourceCodeHash) {
            this.sourceCodeHash = Input.ofNullable(sourceCodeHash);
            return this;
        }
        public LayerVersionArgs build() {
            return new LayerVersionArgs(code, compatibleArchitectures, compatibleRuntimes, description, layerName, licenseInfo, s3Bucket, s3Key, s3ObjectVersion, skipDestroy, sourceCodeHash);
        }
    }
}
