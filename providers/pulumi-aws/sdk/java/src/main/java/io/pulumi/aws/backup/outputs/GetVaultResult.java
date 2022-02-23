// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetVaultResult {
    /**
     * The ARN of the vault.
     * 
     */
    private final String arn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The server-side encryption key that is used to protect your backups.
     * 
     */
    private final String kmsKeyArn;
    private final String name;
    /**
     * The number of recovery points that are stored in a backup vault.
     * 
     */
    private final Integer recoveryPoints;
    /**
     * Metadata that you can assign to help organize the resources that you create.
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor({"arn","id","kmsKeyArn","name","recoveryPoints","tags"})
    private GetVaultResult(
        String arn,
        String id,
        String kmsKeyArn,
        String name,
        Integer recoveryPoints,
        Map<String,String> tags) {
        this.arn = Objects.requireNonNull(arn);
        this.id = Objects.requireNonNull(id);
        this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
        this.name = Objects.requireNonNull(name);
        this.recoveryPoints = Objects.requireNonNull(recoveryPoints);
        this.tags = Objects.requireNonNull(tags);
    }

    /**
     * The ARN of the vault.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The server-side encryption key that is used to protect your backups.
     * 
     */
    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The number of recovery points that are stored in a backup vault.
     * 
     */
    public Integer getRecoveryPoints() {
        return this.recoveryPoints;
    }
    /**
     * Metadata that you can assign to help organize the resources that you create.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVaultResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String kmsKeyArn;
        private String name;
        private Integer recoveryPoints;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVaultResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.name = defaults.name;
    	      this.recoveryPoints = defaults.recoveryPoints;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRecoveryPoints(Integer recoveryPoints) {
            this.recoveryPoints = Objects.requireNonNull(recoveryPoints);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetVaultResult build() {
            return new GetVaultResult(arn, id, kmsKeyArn, name, recoveryPoints, tags);
        }
    }
}
