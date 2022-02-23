// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSecretVersionResult {
    private final String createTime;
    private final String destroyTime;
    private final Boolean enabled;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String project;
    private final String secret;
    private final String secretData;
    private final String version;

    @OutputCustomType.Constructor({"createTime","destroyTime","enabled","id","name","project","secret","secretData","version"})
    private GetSecretVersionResult(
        String createTime,
        String destroyTime,
        Boolean enabled,
        String id,
        String name,
        String project,
        String secret,
        String secretData,
        String version) {
        this.createTime = Objects.requireNonNull(createTime);
        this.destroyTime = Objects.requireNonNull(destroyTime);
        this.enabled = Objects.requireNonNull(enabled);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.project = Objects.requireNonNull(project);
        this.secret = Objects.requireNonNull(secret);
        this.secretData = Objects.requireNonNull(secretData);
        this.version = Objects.requireNonNull(version);
    }

    public String getCreateTime() {
        return this.createTime;
    }
    public String getDestroyTime() {
        return this.destroyTime;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getProject() {
        return this.project;
    }
    public String getSecret() {
        return this.secret;
    }
    public String getSecretData() {
        return this.secretData;
    }
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String destroyTime;
        private Boolean enabled;
        private String id;
        private String name;
        private String project;
        private String secret;
        private String secretData;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.destroyTime = defaults.destroyTime;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.secretData = defaults.secretData;
    	      this.version = defaults.version;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDestroyTime(String destroyTime) {
            this.destroyTime = Objects.requireNonNull(destroyTime);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setSecret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder setSecretData(String secretData) {
            this.secretData = Objects.requireNonNull(secretData);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetSecretVersionResult build() {
            return new GetSecretVersionResult(createTime, destroyTime, enabled, id, name, project, secret, secretData, version);
        }
    }
}
