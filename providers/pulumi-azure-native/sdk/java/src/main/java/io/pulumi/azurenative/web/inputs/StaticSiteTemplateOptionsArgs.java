// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Template Options for the static site.
 * 
 */
public final class StaticSiteTemplateOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StaticSiteTemplateOptionsArgs Empty = new StaticSiteTemplateOptionsArgs();

    /**
     * Description of the newly generated repository.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether or not the newly generated repository is a private repository. Defaults to false (i.e. public).
     * 
     */
    @InputImport(name="isPrivate")
    private final @Nullable Input<Boolean> isPrivate;

    public Input<Boolean> getIsPrivate() {
        return this.isPrivate == null ? Input.empty() : this.isPrivate;
    }

    /**
     * Owner of the newly generated repository.
     * 
     */
    @InputImport(name="owner")
    private final @Nullable Input<String> owner;

    public Input<String> getOwner() {
        return this.owner == null ? Input.empty() : this.owner;
    }

    /**
     * Name of the newly generated repository.
     * 
     */
    @InputImport(name="repositoryName")
    private final @Nullable Input<String> repositoryName;

    public Input<String> getRepositoryName() {
        return this.repositoryName == null ? Input.empty() : this.repositoryName;
    }

    /**
     * URL of the template repository. The newly generated repository will be based on this one.
     * 
     */
    @InputImport(name="templateRepositoryUrl")
    private final @Nullable Input<String> templateRepositoryUrl;

    public Input<String> getTemplateRepositoryUrl() {
        return this.templateRepositoryUrl == null ? Input.empty() : this.templateRepositoryUrl;
    }

    public StaticSiteTemplateOptionsArgs(
        @Nullable Input<String> description,
        @Nullable Input<Boolean> isPrivate,
        @Nullable Input<String> owner,
        @Nullable Input<String> repositoryName,
        @Nullable Input<String> templateRepositoryUrl) {
        this.description = description;
        this.isPrivate = isPrivate;
        this.owner = owner;
        this.repositoryName = repositoryName;
        this.templateRepositoryUrl = templateRepositoryUrl;
    }

    private StaticSiteTemplateOptionsArgs() {
        this.description = Input.empty();
        this.isPrivate = Input.empty();
        this.owner = Input.empty();
        this.repositoryName = Input.empty();
        this.templateRepositoryUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticSiteTemplateOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> isPrivate;
        private @Nullable Input<String> owner;
        private @Nullable Input<String> repositoryName;
        private @Nullable Input<String> templateRepositoryUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticSiteTemplateOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.isPrivate = defaults.isPrivate;
    	      this.owner = defaults.owner;
    	      this.repositoryName = defaults.repositoryName;
    	      this.templateRepositoryUrl = defaults.templateRepositoryUrl;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setIsPrivate(@Nullable Input<Boolean> isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }

        public Builder setIsPrivate(@Nullable Boolean isPrivate) {
            this.isPrivate = Input.ofNullable(isPrivate);
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

        public Builder setRepositoryName(@Nullable Input<String> repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        public Builder setRepositoryName(@Nullable String repositoryName) {
            this.repositoryName = Input.ofNullable(repositoryName);
            return this;
        }

        public Builder setTemplateRepositoryUrl(@Nullable Input<String> templateRepositoryUrl) {
            this.templateRepositoryUrl = templateRepositoryUrl;
            return this;
        }

        public Builder setTemplateRepositoryUrl(@Nullable String templateRepositoryUrl) {
            this.templateRepositoryUrl = Input.ofNullable(templateRepositoryUrl);
            return this;
        }

        public StaticSiteTemplateOptionsArgs build() {
            return new StaticSiteTemplateOptionsArgs(description, isPrivate, owner, repositoryName, templateRepositoryUrl);
        }
    }
}
