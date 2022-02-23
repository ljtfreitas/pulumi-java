// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Installs Windows Updates. Corresponds to Packer Windows Update Provisioner (https://github.com/rgl/packer-provisioner-windows-update)
 * 
 */
public final class ImageTemplateWindowsUpdateCustomizerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageTemplateWindowsUpdateCustomizerArgs Empty = new ImageTemplateWindowsUpdateCustomizerArgs();

    /**
     * Array of filters to select updates to apply. Omit or specify empty array to use the default (no filter). Refer to above link for examples and detailed description of this field.
     * 
     */
    @InputImport(name="filters")
        private final @Nullable Input<List<String>> filters;

    public Input<List<String>> getFilters() {
        return this.filters == null ? Input.empty() : this.filters;
    }

    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Criteria to search updates. Omit or specify empty string to use the default (search all). Refer to above link for examples and detailed description of this field.
     * 
     */
    @InputImport(name="searchCriteria")
        private final @Nullable Input<String> searchCriteria;

    public Input<String> getSearchCriteria() {
        return this.searchCriteria == null ? Input.empty() : this.searchCriteria;
    }

    /**
     * The type of customization tool you want to use on the Image. For example, "Shell" can be shell customizer
     * Expected value is 'WindowsUpdate'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Maximum number of updates to apply at a time. Omit or specify 0 to use the default (1000)
     * 
     */
    @InputImport(name="updateLimit")
        private final @Nullable Input<Integer> updateLimit;

    public Input<Integer> getUpdateLimit() {
        return this.updateLimit == null ? Input.empty() : this.updateLimit;
    }

    public ImageTemplateWindowsUpdateCustomizerArgs(
        @Nullable Input<List<String>> filters,
        @Nullable Input<String> name,
        @Nullable Input<String> searchCriteria,
        Input<String> type,
        @Nullable Input<Integer> updateLimit) {
        this.filters = filters;
        this.name = name;
        this.searchCriteria = searchCriteria;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.updateLimit = updateLimit;
    }

    private ImageTemplateWindowsUpdateCustomizerArgs() {
        this.filters = Input.empty();
        this.name = Input.empty();
        this.searchCriteria = Input.empty();
        this.type = Input.empty();
        this.updateLimit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateWindowsUpdateCustomizerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> filters;
        private @Nullable Input<String> name;
        private @Nullable Input<String> searchCriteria;
        private Input<String> type;
        private @Nullable Input<Integer> updateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateWindowsUpdateCustomizerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.name = defaults.name;
    	      this.searchCriteria = defaults.searchCriteria;
    	      this.type = defaults.type;
    	      this.updateLimit = defaults.updateLimit;
        }

        public Builder setFilters(@Nullable Input<List<String>> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setFilters(@Nullable List<String> filters) {
            this.filters = Input.ofNullable(filters);
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

        public Builder setSearchCriteria(@Nullable Input<String> searchCriteria) {
            this.searchCriteria = searchCriteria;
            return this;
        }

        public Builder setSearchCriteria(@Nullable String searchCriteria) {
            this.searchCriteria = Input.ofNullable(searchCriteria);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUpdateLimit(@Nullable Input<Integer> updateLimit) {
            this.updateLimit = updateLimit;
            return this;
        }

        public Builder setUpdateLimit(@Nullable Integer updateLimit) {
            this.updateLimit = Input.ofNullable(updateLimit);
            return this;
        }
        public ImageTemplateWindowsUpdateCustomizerArgs build() {
            return new ImageTemplateWindowsUpdateCustomizerArgs(filters, name, searchCriteria, type, updateLimit);
        }
    }
}
