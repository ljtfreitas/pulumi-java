// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.aws.lambda.outputs.GetFunctionDeadLetterConfig;
import io.pulumi.aws.lambda.outputs.GetFunctionEnvironment;
import io.pulumi.aws.lambda.outputs.GetFunctionFileSystemConfig;
import io.pulumi.aws.lambda.outputs.GetFunctionTracingConfig;
import io.pulumi.aws.lambda.outputs.GetFunctionVpcConfig;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFunctionResult {
    /**
     * The instruction set architecture for the Lambda function.
     * 
     */
    private final List<String> architectures;
    /**
     * Unqualified (no `:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `qualified_arn`.
     * 
     */
    private final String arn;
    /**
     * Amazon Resource Name (ARN) for a Code Signing Configuration.
     * 
     */
    private final String codeSigningConfigArn;
    /**
     * Configure the function's *dead letter queue*.
     * 
     */
    private final GetFunctionDeadLetterConfig deadLetterConfig;
    /**
     * Description of what your Lambda Function does.
     * 
     */
    private final String description;
    /**
     * The Lambda environment's configuration settings.
     * 
     */
    private final GetFunctionEnvironment environment;
    /**
     * The connection settings for an Amazon EFS file system.
     * 
     */
    private final List<GetFunctionFileSystemConfig> fileSystemConfigs;
    private final String functionName;
    /**
     * The function entrypoint in your code.
     * 
     */
    private final String handler;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The URI of the container image.
     * 
     */
    private final String imageUri;
    /**
     * The ARN to be used for invoking Lambda Function from API Gateway.
     * 
     */
    private final String invokeArn;
    /**
     * The ARN for the KMS encryption key.
     * 
     */
    private final String kmsKeyArn;
    /**
     * The date this resource was last modified.
     * 
     */
    private final String lastModified;
    /**
     * A list of Lambda Layer ARNs attached to your Lambda Function.
     * 
     */
    private final List<String> layers;
    /**
     * Amount of memory in MB your Lambda Function can use at runtime.
     * 
     */
    private final Integer memorySize;
    /**
     * Qualified (`:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `arn`.
     * 
     */
    private final String qualifiedArn;
    private final @Nullable String qualifier;
    /**
     * The amount of reserved concurrent executions for this lambda function or `-1` if unreserved.
     * 
     */
    private final Integer reservedConcurrentExecutions;
    /**
     * IAM role attached to the Lambda Function.
     * 
     */
    private final String role;
    /**
     * The runtime environment for the Lambda function.
     * 
     */
    private final String runtime;
    /**
     * The Amazon Resource Name (ARN) of a signing job.
     * 
     */
    private final String signingJobArn;
    /**
     * The Amazon Resource Name (ARN) for a signing profile version.
     * 
     */
    private final String signingProfileVersionArn;
    /**
     * Base64-encoded representation of raw SHA-256 sum of the zip file.
     * 
     */
    private final String sourceCodeHash;
    /**
     * The size in bytes of the function .zip file.
     * 
     */
    private final Integer sourceCodeSize;
    private final Map<String,String> tags;
    /**
     * The function execution time at which Lambda should terminate the function.
     * 
     */
    private final Integer timeout;
    /**
     * Tracing settings of the function.
     * 
     */
    private final GetFunctionTracingConfig tracingConfig;
    /**
     * The version of the Lambda function.
     * 
     */
    private final String version;
    /**
     * VPC configuration associated with your Lambda function.
     * 
     */
    private final GetFunctionVpcConfig vpcConfig;

    @OutputCustomType.Constructor({"architectures","arn","codeSigningConfigArn","deadLetterConfig","description","environment","fileSystemConfigs","functionName","handler","id","imageUri","invokeArn","kmsKeyArn","lastModified","layers","memorySize","qualifiedArn","qualifier","reservedConcurrentExecutions","role","runtime","signingJobArn","signingProfileVersionArn","sourceCodeHash","sourceCodeSize","tags","timeout","tracingConfig","version","vpcConfig"})
    private GetFunctionResult(
        List<String> architectures,
        String arn,
        String codeSigningConfigArn,
        GetFunctionDeadLetterConfig deadLetterConfig,
        String description,
        GetFunctionEnvironment environment,
        List<GetFunctionFileSystemConfig> fileSystemConfigs,
        String functionName,
        String handler,
        String id,
        String imageUri,
        String invokeArn,
        String kmsKeyArn,
        String lastModified,
        List<String> layers,
        Integer memorySize,
        String qualifiedArn,
        @Nullable String qualifier,
        Integer reservedConcurrentExecutions,
        String role,
        String runtime,
        String signingJobArn,
        String signingProfileVersionArn,
        String sourceCodeHash,
        Integer sourceCodeSize,
        Map<String,String> tags,
        Integer timeout,
        GetFunctionTracingConfig tracingConfig,
        String version,
        GetFunctionVpcConfig vpcConfig) {
        this.architectures = Objects.requireNonNull(architectures);
        this.arn = Objects.requireNonNull(arn);
        this.codeSigningConfigArn = Objects.requireNonNull(codeSigningConfigArn);
        this.deadLetterConfig = Objects.requireNonNull(deadLetterConfig);
        this.description = Objects.requireNonNull(description);
        this.environment = Objects.requireNonNull(environment);
        this.fileSystemConfigs = Objects.requireNonNull(fileSystemConfigs);
        this.functionName = Objects.requireNonNull(functionName);
        this.handler = Objects.requireNonNull(handler);
        this.id = Objects.requireNonNull(id);
        this.imageUri = Objects.requireNonNull(imageUri);
        this.invokeArn = Objects.requireNonNull(invokeArn);
        this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
        this.lastModified = Objects.requireNonNull(lastModified);
        this.layers = Objects.requireNonNull(layers);
        this.memorySize = Objects.requireNonNull(memorySize);
        this.qualifiedArn = Objects.requireNonNull(qualifiedArn);
        this.qualifier = qualifier;
        this.reservedConcurrentExecutions = Objects.requireNonNull(reservedConcurrentExecutions);
        this.role = Objects.requireNonNull(role);
        this.runtime = Objects.requireNonNull(runtime);
        this.signingJobArn = Objects.requireNonNull(signingJobArn);
        this.signingProfileVersionArn = Objects.requireNonNull(signingProfileVersionArn);
        this.sourceCodeHash = Objects.requireNonNull(sourceCodeHash);
        this.sourceCodeSize = Objects.requireNonNull(sourceCodeSize);
        this.tags = Objects.requireNonNull(tags);
        this.timeout = Objects.requireNonNull(timeout);
        this.tracingConfig = Objects.requireNonNull(tracingConfig);
        this.version = Objects.requireNonNull(version);
        this.vpcConfig = Objects.requireNonNull(vpcConfig);
    }

    /**
     * The instruction set architecture for the Lambda function.
     * 
     */
    public List<String> getArchitectures() {
        return this.architectures;
    }
    /**
     * Unqualified (no `:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `qualified_arn`.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * Amazon Resource Name (ARN) for a Code Signing Configuration.
     * 
     */
    public String getCodeSigningConfigArn() {
        return this.codeSigningConfigArn;
    }
    /**
     * Configure the function's *dead letter queue*.
     * 
     */
    public GetFunctionDeadLetterConfig getDeadLetterConfig() {
        return this.deadLetterConfig;
    }
    /**
     * Description of what your Lambda Function does.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The Lambda environment's configuration settings.
     * 
     */
    public GetFunctionEnvironment getEnvironment() {
        return this.environment;
    }
    /**
     * The connection settings for an Amazon EFS file system.
     * 
     */
    public List<GetFunctionFileSystemConfig> getFileSystemConfigs() {
        return this.fileSystemConfigs;
    }
    public String getFunctionName() {
        return this.functionName;
    }
    /**
     * The function entrypoint in your code.
     * 
     */
    public String getHandler() {
        return this.handler;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The URI of the container image.
     * 
     */
    public String getImageUri() {
        return this.imageUri;
    }
    /**
     * The ARN to be used for invoking Lambda Function from API Gateway.
     * 
     */
    public String getInvokeArn() {
        return this.invokeArn;
    }
    /**
     * The ARN for the KMS encryption key.
     * 
     */
    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }
    /**
     * The date this resource was last modified.
     * 
     */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * A list of Lambda Layer ARNs attached to your Lambda Function.
     * 
     */
    public List<String> getLayers() {
        return this.layers;
    }
    /**
     * Amount of memory in MB your Lambda Function can use at runtime.
     * 
     */
    public Integer getMemorySize() {
        return this.memorySize;
    }
    /**
     * Qualified (`:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `arn`.
     * 
     */
    public String getQualifiedArn() {
        return this.qualifiedArn;
    }
    public Optional<String> getQualifier() {
        return Optional.ofNullable(this.qualifier);
    }
    /**
     * The amount of reserved concurrent executions for this lambda function or `-1` if unreserved.
     * 
     */
    public Integer getReservedConcurrentExecutions() {
        return this.reservedConcurrentExecutions;
    }
    /**
     * IAM role attached to the Lambda Function.
     * 
     */
    public String getRole() {
        return this.role;
    }
    /**
     * The runtime environment for the Lambda function.
     * 
     */
    public String getRuntime() {
        return this.runtime;
    }
    /**
     * The Amazon Resource Name (ARN) of a signing job.
     * 
     */
    public String getSigningJobArn() {
        return this.signingJobArn;
    }
    /**
     * The Amazon Resource Name (ARN) for a signing profile version.
     * 
     */
    public String getSigningProfileVersionArn() {
        return this.signingProfileVersionArn;
    }
    /**
     * Base64-encoded representation of raw SHA-256 sum of the zip file.
     * 
     */
    public String getSourceCodeHash() {
        return this.sourceCodeHash;
    }
    /**
     * The size in bytes of the function .zip file.
     * 
     */
    public Integer getSourceCodeSize() {
        return this.sourceCodeSize;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The function execution time at which Lambda should terminate the function.
     * 
     */
    public Integer getTimeout() {
        return this.timeout;
    }
    /**
     * Tracing settings of the function.
     * 
     */
    public GetFunctionTracingConfig getTracingConfig() {
        return this.tracingConfig;
    }
    /**
     * The version of the Lambda function.
     * 
     */
    public String getVersion() {
        return this.version;
    }
    /**
     * VPC configuration associated with your Lambda function.
     * 
     */
    public GetFunctionVpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> architectures;
        private String arn;
        private String codeSigningConfigArn;
        private GetFunctionDeadLetterConfig deadLetterConfig;
        private String description;
        private GetFunctionEnvironment environment;
        private List<GetFunctionFileSystemConfig> fileSystemConfigs;
        private String functionName;
        private String handler;
        private String id;
        private String imageUri;
        private String invokeArn;
        private String kmsKeyArn;
        private String lastModified;
        private List<String> layers;
        private Integer memorySize;
        private String qualifiedArn;
        private @Nullable String qualifier;
        private Integer reservedConcurrentExecutions;
        private String role;
        private String runtime;
        private String signingJobArn;
        private String signingProfileVersionArn;
        private String sourceCodeHash;
        private Integer sourceCodeSize;
        private Map<String,String> tags;
        private Integer timeout;
        private GetFunctionTracingConfig tracingConfig;
        private String version;
        private GetFunctionVpcConfig vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architectures = defaults.architectures;
    	      this.arn = defaults.arn;
    	      this.codeSigningConfigArn = defaults.codeSigningConfigArn;
    	      this.deadLetterConfig = defaults.deadLetterConfig;
    	      this.description = defaults.description;
    	      this.environment = defaults.environment;
    	      this.fileSystemConfigs = defaults.fileSystemConfigs;
    	      this.functionName = defaults.functionName;
    	      this.handler = defaults.handler;
    	      this.id = defaults.id;
    	      this.imageUri = defaults.imageUri;
    	      this.invokeArn = defaults.invokeArn;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.lastModified = defaults.lastModified;
    	      this.layers = defaults.layers;
    	      this.memorySize = defaults.memorySize;
    	      this.qualifiedArn = defaults.qualifiedArn;
    	      this.qualifier = defaults.qualifier;
    	      this.reservedConcurrentExecutions = defaults.reservedConcurrentExecutions;
    	      this.role = defaults.role;
    	      this.runtime = defaults.runtime;
    	      this.signingJobArn = defaults.signingJobArn;
    	      this.signingProfileVersionArn = defaults.signingProfileVersionArn;
    	      this.sourceCodeHash = defaults.sourceCodeHash;
    	      this.sourceCodeSize = defaults.sourceCodeSize;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.tracingConfig = defaults.tracingConfig;
    	      this.version = defaults.version;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder setArchitectures(List<String> architectures) {
            this.architectures = Objects.requireNonNull(architectures);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCodeSigningConfigArn(String codeSigningConfigArn) {
            this.codeSigningConfigArn = Objects.requireNonNull(codeSigningConfigArn);
            return this;
        }

        public Builder setDeadLetterConfig(GetFunctionDeadLetterConfig deadLetterConfig) {
            this.deadLetterConfig = Objects.requireNonNull(deadLetterConfig);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEnvironment(GetFunctionEnvironment environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder setFileSystemConfigs(List<GetFunctionFileSystemConfig> fileSystemConfigs) {
            this.fileSystemConfigs = Objects.requireNonNull(fileSystemConfigs);
            return this;
        }

        public Builder setFunctionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }

        public Builder setHandler(String handler) {
            this.handler = Objects.requireNonNull(handler);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImageUri(String imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }

        public Builder setInvokeArn(String invokeArn) {
            this.invokeArn = Objects.requireNonNull(invokeArn);
            return this;
        }

        public Builder setKmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setLayers(List<String> layers) {
            this.layers = Objects.requireNonNull(layers);
            return this;
        }

        public Builder setMemorySize(Integer memorySize) {
            this.memorySize = Objects.requireNonNull(memorySize);
            return this;
        }

        public Builder setQualifiedArn(String qualifiedArn) {
            this.qualifiedArn = Objects.requireNonNull(qualifiedArn);
            return this;
        }

        public Builder setQualifier(@Nullable String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        public Builder setReservedConcurrentExecutions(Integer reservedConcurrentExecutions) {
            this.reservedConcurrentExecutions = Objects.requireNonNull(reservedConcurrentExecutions);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRuntime(String runtime) {
            this.runtime = Objects.requireNonNull(runtime);
            return this;
        }

        public Builder setSigningJobArn(String signingJobArn) {
            this.signingJobArn = Objects.requireNonNull(signingJobArn);
            return this;
        }

        public Builder setSigningProfileVersionArn(String signingProfileVersionArn) {
            this.signingProfileVersionArn = Objects.requireNonNull(signingProfileVersionArn);
            return this;
        }

        public Builder setSourceCodeHash(String sourceCodeHash) {
            this.sourceCodeHash = Objects.requireNonNull(sourceCodeHash);
            return this;
        }

        public Builder setSourceCodeSize(Integer sourceCodeSize) {
            this.sourceCodeSize = Objects.requireNonNull(sourceCodeSize);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setTimeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public Builder setTracingConfig(GetFunctionTracingConfig tracingConfig) {
            this.tracingConfig = Objects.requireNonNull(tracingConfig);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setVpcConfig(GetFunctionVpcConfig vpcConfig) {
            this.vpcConfig = Objects.requireNonNull(vpcConfig);
            return this;
        }
        public GetFunctionResult build() {
            return new GetFunctionResult(architectures, arn, codeSigningConfigArn, deadLetterConfig, description, environment, fileSystemConfigs, functionName, handler, id, imageUri, invokeArn, kmsKeyArn, lastModified, layers, memorySize, qualifiedArn, qualifier, reservedConcurrentExecutions, role, runtime, signingJobArn, signingProfileVersionArn, sourceCodeHash, sourceCodeSize, tags, timeout, tracingConfig, version, vpcConfig);
        }
    }
}
