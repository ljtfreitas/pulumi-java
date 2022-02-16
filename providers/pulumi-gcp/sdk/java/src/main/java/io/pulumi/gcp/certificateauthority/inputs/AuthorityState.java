// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityAccessUrlGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityKeySpecGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorityState extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityState Empty = new AuthorityState();

    @InputImport(name="accessUrls")
    private final @Nullable Input<List<AuthorityAccessUrlGetArgs>> accessUrls;

    public Input<List<AuthorityAccessUrlGetArgs>> getAccessUrls() {
        return this.accessUrls == null ? Input.empty() : this.accessUrls;
    }

    @InputImport(name="certificateAuthorityId")
    private final @Nullable Input<String> certificateAuthorityId;

    public Input<String> getCertificateAuthorityId() {
        return this.certificateAuthorityId == null ? Input.empty() : this.certificateAuthorityId;
    }

    @InputImport(name="config")
    private final @Nullable Input<AuthorityConfigGetArgs> config;

    public Input<AuthorityConfigGetArgs> getConfig() {
        return this.config == null ? Input.empty() : this.config;
    }

    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    @InputImport(name="gcsBucket")
    private final @Nullable Input<String> gcsBucket;

    public Input<String> getGcsBucket() {
        return this.gcsBucket == null ? Input.empty() : this.gcsBucket;
    }

    @InputImport(name="ignoreActiveCertificatesOnDeletion")
    private final @Nullable Input<Boolean> ignoreActiveCertificatesOnDeletion;

    public Input<Boolean> getIgnoreActiveCertificatesOnDeletion() {
        return this.ignoreActiveCertificatesOnDeletion == null ? Input.empty() : this.ignoreActiveCertificatesOnDeletion;
    }

    @InputImport(name="keySpec")
    private final @Nullable Input<AuthorityKeySpecGetArgs> keySpec;

    public Input<AuthorityKeySpecGetArgs> getKeySpec() {
        return this.keySpec == null ? Input.empty() : this.keySpec;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="lifetime")
    private final @Nullable Input<String> lifetime;

    public Input<String> getLifetime() {
        return this.lifetime == null ? Input.empty() : this.lifetime;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="pemCaCertificates")
    private final @Nullable Input<List<String>> pemCaCertificates;

    public Input<List<String>> getPemCaCertificates() {
        return this.pemCaCertificates == null ? Input.empty() : this.pemCaCertificates;
    }

    @InputImport(name="pool")
    private final @Nullable Input<String> pool;

    public Input<String> getPool() {
        return this.pool == null ? Input.empty() : this.pool;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public AuthorityState(
        @Nullable Input<List<AuthorityAccessUrlGetArgs>> accessUrls,
        @Nullable Input<String> certificateAuthorityId,
        @Nullable Input<AuthorityConfigGetArgs> config,
        @Nullable Input<String> createTime,
        @Nullable Input<String> gcsBucket,
        @Nullable Input<Boolean> ignoreActiveCertificatesOnDeletion,
        @Nullable Input<AuthorityKeySpecGetArgs> keySpec,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> lifetime,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> pemCaCertificates,
        @Nullable Input<String> pool,
        @Nullable Input<String> project,
        @Nullable Input<String> state,
        @Nullable Input<String> type,
        @Nullable Input<String> updateTime) {
        this.accessUrls = accessUrls;
        this.certificateAuthorityId = certificateAuthorityId;
        this.config = config;
        this.createTime = createTime;
        this.gcsBucket = gcsBucket;
        this.ignoreActiveCertificatesOnDeletion = ignoreActiveCertificatesOnDeletion;
        this.keySpec = keySpec;
        this.labels = labels;
        this.lifetime = lifetime;
        this.location = location;
        this.name = name;
        this.pemCaCertificates = pemCaCertificates;
        this.pool = pool;
        this.project = project;
        this.state = state;
        this.type = type;
        this.updateTime = updateTime;
    }

    private AuthorityState() {
        this.accessUrls = Input.empty();
        this.certificateAuthorityId = Input.empty();
        this.config = Input.empty();
        this.createTime = Input.empty();
        this.gcsBucket = Input.empty();
        this.ignoreActiveCertificatesOnDeletion = Input.empty();
        this.keySpec = Input.empty();
        this.labels = Input.empty();
        this.lifetime = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.pemCaCertificates = Input.empty();
        this.pool = Input.empty();
        this.project = Input.empty();
        this.state = Input.empty();
        this.type = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AuthorityAccessUrlGetArgs>> accessUrls;
        private @Nullable Input<String> certificateAuthorityId;
        private @Nullable Input<AuthorityConfigGetArgs> config;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> gcsBucket;
        private @Nullable Input<Boolean> ignoreActiveCertificatesOnDeletion;
        private @Nullable Input<AuthorityKeySpecGetArgs> keySpec;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> lifetime;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> pemCaCertificates;
        private @Nullable Input<String> pool;
        private @Nullable Input<String> project;
        private @Nullable Input<String> state;
        private @Nullable Input<String> type;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessUrls = defaults.accessUrls;
    	      this.certificateAuthorityId = defaults.certificateAuthorityId;
    	      this.config = defaults.config;
    	      this.createTime = defaults.createTime;
    	      this.gcsBucket = defaults.gcsBucket;
    	      this.ignoreActiveCertificatesOnDeletion = defaults.ignoreActiveCertificatesOnDeletion;
    	      this.keySpec = defaults.keySpec;
    	      this.labels = defaults.labels;
    	      this.lifetime = defaults.lifetime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.pemCaCertificates = defaults.pemCaCertificates;
    	      this.pool = defaults.pool;
    	      this.project = defaults.project;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setAccessUrls(@Nullable Input<List<AuthorityAccessUrlGetArgs>> accessUrls) {
            this.accessUrls = accessUrls;
            return this;
        }

        public Builder setAccessUrls(@Nullable List<AuthorityAccessUrlGetArgs> accessUrls) {
            this.accessUrls = Input.ofNullable(accessUrls);
            return this;
        }

        public Builder setCertificateAuthorityId(@Nullable Input<String> certificateAuthorityId) {
            this.certificateAuthorityId = certificateAuthorityId;
            return this;
        }

        public Builder setCertificateAuthorityId(@Nullable String certificateAuthorityId) {
            this.certificateAuthorityId = Input.ofNullable(certificateAuthorityId);
            return this;
        }

        public Builder setConfig(@Nullable Input<AuthorityConfigGetArgs> config) {
            this.config = config;
            return this;
        }

        public Builder setConfig(@Nullable AuthorityConfigGetArgs config) {
            this.config = Input.ofNullable(config);
            return this;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setGcsBucket(@Nullable Input<String> gcsBucket) {
            this.gcsBucket = gcsBucket;
            return this;
        }

        public Builder setGcsBucket(@Nullable String gcsBucket) {
            this.gcsBucket = Input.ofNullable(gcsBucket);
            return this;
        }

        public Builder setIgnoreActiveCertificatesOnDeletion(@Nullable Input<Boolean> ignoreActiveCertificatesOnDeletion) {
            this.ignoreActiveCertificatesOnDeletion = ignoreActiveCertificatesOnDeletion;
            return this;
        }

        public Builder setIgnoreActiveCertificatesOnDeletion(@Nullable Boolean ignoreActiveCertificatesOnDeletion) {
            this.ignoreActiveCertificatesOnDeletion = Input.ofNullable(ignoreActiveCertificatesOnDeletion);
            return this;
        }

        public Builder setKeySpec(@Nullable Input<AuthorityKeySpecGetArgs> keySpec) {
            this.keySpec = keySpec;
            return this;
        }

        public Builder setKeySpec(@Nullable AuthorityKeySpecGetArgs keySpec) {
            this.keySpec = Input.ofNullable(keySpec);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLifetime(@Nullable Input<String> lifetime) {
            this.lifetime = lifetime;
            return this;
        }

        public Builder setLifetime(@Nullable String lifetime) {
            this.lifetime = Input.ofNullable(lifetime);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPemCaCertificates(@Nullable Input<List<String>> pemCaCertificates) {
            this.pemCaCertificates = pemCaCertificates;
            return this;
        }

        public Builder setPemCaCertificates(@Nullable List<String> pemCaCertificates) {
            this.pemCaCertificates = Input.ofNullable(pemCaCertificates);
            return this;
        }

        public Builder setPool(@Nullable Input<String> pool) {
            this.pool = pool;
            return this;
        }

        public Builder setPool(@Nullable String pool) {
            this.pool = Input.ofNullable(pool);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public AuthorityState build() {
            return new AuthorityState(accessUrls, certificateAuthorityId, config, createTime, gcsBucket, ignoreActiveCertificatesOnDeletion, keySpec, labels, lifetime, location, name, pemCaCertificates, pool, project, state, type, updateTime);
        }
    }
}