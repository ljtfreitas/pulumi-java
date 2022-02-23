// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AclState extends io.pulumi.resources.ResourceArgs {

    public static final AclState Empty = new AclState();

    /**
     * The ARN of the ACL.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The minimum engine version supported by the ACL.
     * 
     */
    @InputImport(name="minimumEngineVersion")
    private final @Nullable Input<String> minimumEngineVersion;

    public Input<String> getMinimumEngineVersion() {
        return this.minimumEngineVersion == null ? Input.empty() : this.minimumEngineVersion;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
    private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Set of MemoryDB user names to be included in this ACL.
     * 
     */
    @InputImport(name="userNames")
    private final @Nullable Input<List<String>> userNames;

    public Input<List<String>> getUserNames() {
        return this.userNames == null ? Input.empty() : this.userNames;
    }

    public AclState(
        @Nullable Input<String> arn,
        @Nullable Input<String> minimumEngineVersion,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<List<String>> userNames) {
        this.arn = arn;
        this.minimumEngineVersion = minimumEngineVersion;
        this.name = name;
        this.namePrefix = namePrefix;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userNames = userNames;
    }

    private AclState() {
        this.arn = Input.empty();
        this.minimumEngineVersion = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.userNames = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> minimumEngineVersion;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<List<String>> userNames;

        public Builder() {
    	      // Empty
        }

        public Builder(AclState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.minimumEngineVersion = defaults.minimumEngineVersion;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userNames = defaults.userNames;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setMinimumEngineVersion(@Nullable Input<String> minimumEngineVersion) {
            this.minimumEngineVersion = minimumEngineVersion;
            return this;
        }

        public Builder setMinimumEngineVersion(@Nullable String minimumEngineVersion) {
            this.minimumEngineVersion = Input.ofNullable(minimumEngineVersion);
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

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setUserNames(@Nullable Input<List<String>> userNames) {
            this.userNames = userNames;
            return this;
        }

        public Builder setUserNames(@Nullable List<String> userNames) {
            this.userNames = Input.ofNullable(userNames);
            return this;
        }
        public AclState build() {
            return new AclState(arn, minimumEngineVersion, name, namePrefix, tags, tagsAll, userNames);
        }
    }
}
