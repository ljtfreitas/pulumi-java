// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.ImageRecipeBlockDeviceMappingGetArgs;
import io.pulumi.aws.imagebuilder.inputs.ImageRecipeComponentGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageRecipeState extends io.pulumi.resources.ResourceArgs {

    public static final ImageRecipeState Empty = new ImageRecipeState();

    /**
     * (Required) Amazon Resource Name (ARN) of the image recipe.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Configuration block(s) with block device mappings for the the image recipe. Detailed below.
     * 
     */
    @InputImport(name="blockDeviceMappings")
    private final @Nullable Input<List<ImageRecipeBlockDeviceMappingGetArgs>> blockDeviceMappings;

    public Input<List<ImageRecipeBlockDeviceMappingGetArgs>> getBlockDeviceMappings() {
        return this.blockDeviceMappings == null ? Input.empty() : this.blockDeviceMappings;
    }

    /**
     * Ordered configuration block(s) with components for the image recipe. Detailed below.
     * 
     */
    @InputImport(name="components")
    private final @Nullable Input<List<ImageRecipeComponentGetArgs>> components;

    public Input<List<ImageRecipeComponentGetArgs>> getComponents() {
        return this.components == null ? Input.empty() : this.components;
    }

    /**
     * Date the image recipe was created.
     * 
     */
    @InputImport(name="dateCreated")
    private final @Nullable Input<String> dateCreated;

    public Input<String> getDateCreated() {
        return this.dateCreated == null ? Input.empty() : this.dateCreated;
    }

    /**
     * Description of the image recipe.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the image recipe.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Owner of the image recipe.
     * 
     */
    @InputImport(name="owner")
    private final @Nullable Input<String> owner;

    public Input<String> getOwner() {
        return this.owner == null ? Input.empty() : this.owner;
    }

    /**
     * Platform of the image recipe.
     * 
     */
    @InputImport(name="parentImage")
    private final @Nullable Input<String> parentImage;

    public Input<String> getParentImage() {
        return this.parentImage == null ? Input.empty() : this.parentImage;
    }

    /**
     * Platform of the image recipe.
     * 
     */
    @InputImport(name="platform")
    private final @Nullable Input<String> platform;

    public Input<String> getPlatform() {
        return this.platform == null ? Input.empty() : this.platform;
    }

    /**
     * Key-value map of resource tags for the image recipe. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Base64 encoded user data. Use this to provide commands or a command script to run when you launch your build instance.
     * 
     */
    @InputImport(name="userDataBase64")
    private final @Nullable Input<String> userDataBase64;

    public Input<String> getUserDataBase64() {
        return this.userDataBase64 == null ? Input.empty() : this.userDataBase64;
    }

    /**
     * Version of the image recipe.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    /**
     * The working directory to be used during build and test workflows.
     * 
     */
    @InputImport(name="workingDirectory")
    private final @Nullable Input<String> workingDirectory;

    public Input<String> getWorkingDirectory() {
        return this.workingDirectory == null ? Input.empty() : this.workingDirectory;
    }

    public ImageRecipeState(
        @Nullable Input<String> arn,
        @Nullable Input<List<ImageRecipeBlockDeviceMappingGetArgs>> blockDeviceMappings,
        @Nullable Input<List<ImageRecipeComponentGetArgs>> components,
        @Nullable Input<String> dateCreated,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> owner,
        @Nullable Input<String> parentImage,
        @Nullable Input<String> platform,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> userDataBase64,
        @Nullable Input<String> version,
        @Nullable Input<String> workingDirectory) {
        this.arn = arn;
        this.blockDeviceMappings = blockDeviceMappings;
        this.components = components;
        this.dateCreated = dateCreated;
        this.description = description;
        this.name = name;
        this.owner = owner;
        this.parentImage = parentImage;
        this.platform = platform;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userDataBase64 = userDataBase64;
        this.version = version;
        this.workingDirectory = workingDirectory;
    }

    private ImageRecipeState() {
        this.arn = Input.empty();
        this.blockDeviceMappings = Input.empty();
        this.components = Input.empty();
        this.dateCreated = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.owner = Input.empty();
        this.parentImage = Input.empty();
        this.platform = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.userDataBase64 = Input.empty();
        this.version = Input.empty();
        this.workingDirectory = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<ImageRecipeBlockDeviceMappingGetArgs>> blockDeviceMappings;
        private @Nullable Input<List<ImageRecipeComponentGetArgs>> components;
        private @Nullable Input<String> dateCreated;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> owner;
        private @Nullable Input<String> parentImage;
        private @Nullable Input<String> platform;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> userDataBase64;
        private @Nullable Input<String> version;
        private @Nullable Input<String> workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.blockDeviceMappings = defaults.blockDeviceMappings;
    	      this.components = defaults.components;
    	      this.dateCreated = defaults.dateCreated;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.parentImage = defaults.parentImage;
    	      this.platform = defaults.platform;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userDataBase64 = defaults.userDataBase64;
    	      this.version = defaults.version;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setBlockDeviceMappings(@Nullable Input<List<ImageRecipeBlockDeviceMappingGetArgs>> blockDeviceMappings) {
            this.blockDeviceMappings = blockDeviceMappings;
            return this;
        }

        public Builder setBlockDeviceMappings(@Nullable List<ImageRecipeBlockDeviceMappingGetArgs> blockDeviceMappings) {
            this.blockDeviceMappings = Input.ofNullable(blockDeviceMappings);
            return this;
        }

        public Builder setComponents(@Nullable Input<List<ImageRecipeComponentGetArgs>> components) {
            this.components = components;
            return this;
        }

        public Builder setComponents(@Nullable List<ImageRecipeComponentGetArgs> components) {
            this.components = Input.ofNullable(components);
            return this;
        }

        public Builder setDateCreated(@Nullable Input<String> dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        public Builder setDateCreated(@Nullable String dateCreated) {
            this.dateCreated = Input.ofNullable(dateCreated);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOwner(@Nullable Input<String> owner) {
            this.owner = owner;
            return this;
        }

        public Builder setOwner(@Nullable String owner) {
            this.owner = Input.ofNullable(owner);
            return this;
        }

        public Builder setParentImage(@Nullable Input<String> parentImage) {
            this.parentImage = parentImage;
            return this;
        }

        public Builder setParentImage(@Nullable String parentImage) {
            this.parentImage = Input.ofNullable(parentImage);
            return this;
        }

        public Builder setPlatform(@Nullable Input<String> platform) {
            this.platform = platform;
            return this;
        }

        public Builder setPlatform(@Nullable String platform) {
            this.platform = Input.ofNullable(platform);
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

        public Builder setUserDataBase64(@Nullable Input<String> userDataBase64) {
            this.userDataBase64 = userDataBase64;
            return this;
        }

        public Builder setUserDataBase64(@Nullable String userDataBase64) {
            this.userDataBase64 = Input.ofNullable(userDataBase64);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setWorkingDirectory(@Nullable Input<String> workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }

        public Builder setWorkingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = Input.ofNullable(workingDirectory);
            return this;
        }
        public ImageRecipeState build() {
            return new ImageRecipeState(arn, blockDeviceMappings, components, dateCreated, description, name, owner, parentImage, platform, tags, tagsAll, userDataBase64, version, workingDirectory);
        }
    }
}
