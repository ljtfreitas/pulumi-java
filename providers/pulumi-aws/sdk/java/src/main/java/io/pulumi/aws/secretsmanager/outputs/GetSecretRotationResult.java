// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager.outputs;

import io.pulumi.aws.secretsmanager.outputs.GetSecretRotationRotationRule;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetSecretRotationResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The ARN of the secret.
     * 
     */
    private final Boolean rotationEnabled;
    /**
     * The decrypted part of the protected secret information that was originally provided as a string.
     * 
     */
    private final String rotationLambdaArn;
    /**
     * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
     * 
     */
    private final List<GetSecretRotationRotationRule> rotationRules;
    private final String secretId;

    @OutputCustomType.Constructor({"id","rotationEnabled","rotationLambdaArn","rotationRules","secretId"})
    private GetSecretRotationResult(
        String id,
        Boolean rotationEnabled,
        String rotationLambdaArn,
        List<GetSecretRotationRotationRule> rotationRules,
        String secretId) {
        this.id = Objects.requireNonNull(id);
        this.rotationEnabled = Objects.requireNonNull(rotationEnabled);
        this.rotationLambdaArn = Objects.requireNonNull(rotationLambdaArn);
        this.rotationRules = Objects.requireNonNull(rotationRules);
        this.secretId = Objects.requireNonNull(secretId);
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The ARN of the secret.
     * 
     */
    public Boolean getRotationEnabled() {
        return this.rotationEnabled;
    }
    /**
     * The decrypted part of the protected secret information that was originally provided as a string.
     * 
     */
    public String getRotationLambdaArn() {
        return this.rotationLambdaArn;
    }
    /**
     * The decrypted part of the protected secret information that was originally provided as a binary. Base64 encoded.
     * 
     */
    public List<GetSecretRotationRotationRule> getRotationRules() {
        return this.rotationRules;
    }
    public String getSecretId() {
        return this.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretRotationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private Boolean rotationEnabled;
        private String rotationLambdaArn;
        private List<GetSecretRotationRotationRule> rotationRules;
        private String secretId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretRotationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.rotationEnabled = defaults.rotationEnabled;
    	      this.rotationLambdaArn = defaults.rotationLambdaArn;
    	      this.rotationRules = defaults.rotationRules;
    	      this.secretId = defaults.secretId;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setRotationEnabled(Boolean rotationEnabled) {
            this.rotationEnabled = Objects.requireNonNull(rotationEnabled);
            return this;
        }

        public Builder setRotationLambdaArn(String rotationLambdaArn) {
            this.rotationLambdaArn = Objects.requireNonNull(rotationLambdaArn);
            return this;
        }

        public Builder setRotationRules(List<GetSecretRotationRotationRule> rotationRules) {
            this.rotationRules = Objects.requireNonNull(rotationRules);
            return this;
        }

        public Builder setSecretId(String secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }
        public GetSecretRotationResult build() {
            return new GetSecretRotationResult(id, rotationEnabled, rotationLambdaArn, rotationRules, secretId);
        }
    }
}
