// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetRepositoryResult {
    /**
     * The time when the repository was created.
     * 
     */
    private final String createTime;
    /**
     * The user-provided description of the repository.
     * 
     */
    private final String description;
    /**
     * The format of packages that are stored in the repository.
     * 
     */
    private final String format;
    /**
     * The Cloud KMS resource name of the customer managed encryption key that’s used to encrypt the contents of the Repository. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. This value may not be changed after the Repository has been created.
     * 
     */
    private final String kmsKeyName;
    /**
     * Labels with user-defined metadata. This field may contain up to 64 entries. Label keys and values may be no longer than 63 characters. Label keys must begin with a lowercase letter and may only contain lowercase letters, numeric characters, underscores, and dashes.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The name of the repository, for example: "projects/p1/locations/us-central1/repositories/repo1".
     * 
     */
    private final String name;
    /**
     * The time when the repository was last updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","description","format","kmsKeyName","labels","name","updateTime"})
    private GetRepositoryResult(
        String createTime,
        String description,
        String format,
        String kmsKeyName,
        Map<String,String> labels,
        String name,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.description = Objects.requireNonNull(description);
        this.format = Objects.requireNonNull(format);
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * The time when the repository was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The user-provided description of the repository.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The format of packages that are stored in the repository.
     * 
     */
    public String getFormat() {
        return this.format;
    }
    /**
     * The Cloud KMS resource name of the customer managed encryption key that’s used to encrypt the contents of the Repository. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. This value may not be changed after the Repository has been created.
     * 
     */
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * Labels with user-defined metadata. This field may contain up to 64 entries. Label keys and values may be no longer than 63 characters. Label keys must begin with a lowercase letter and may only contain lowercase letters, numeric characters, underscores, and dashes.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The name of the repository, for example: "projects/p1/locations/us-central1/repositories/repo1".
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The time when the repository was last updated.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String format;
        private String kmsKeyName;
        private Map<String,String> labels;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.format = defaults.format;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFormat(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetRepositoryResult build() {
            return new GetRepositoryResult(createTime, description, format, kmsKeyName, labels, name, updateTime);
        }
    }
}
