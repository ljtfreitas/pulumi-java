// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudsearch_v1.inputs.GSuitePrincipalArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceArgs Empty = new DataSourceArgs();

    /**
     * If true, sets the datasource to read-only mode. In read-only mode, the Indexing API rejects any requests to index or delete items in this source. Enabling read-only mode does not stop the processing of previously accepted data.
     * 
     */
    @InputImport(name="disableModifications")
      private final @Nullable Input<Boolean> disableModifications;

    public Input<Boolean> getDisableModifications() {
        return this.disableModifications == null ? Input.empty() : this.disableModifications;
    }

    /**
     * Disable serving any search or assist results.
     * 
     */
    @InputImport(name="disableServing")
      private final @Nullable Input<Boolean> disableServing;

    public Input<Boolean> getDisableServing() {
        return this.disableServing == null ? Input.empty() : this.disableServing;
    }

    /**
     * Display name of the datasource The maximum length is 300 characters.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * List of service accounts that have indexing access.
     * 
     */
    @InputImport(name="indexingServiceAccounts")
      private final @Nullable Input<List<String>> indexingServiceAccounts;

    public Input<List<String>> getIndexingServiceAccounts() {
        return this.indexingServiceAccounts == null ? Input.empty() : this.indexingServiceAccounts;
    }

    /**
     * This field restricts visibility to items at the datasource level. Items within the datasource are restricted to the union of users and groups included in this field. Note that, this does not ensure access to a specific item, as users need to have ACL permissions on the contained items. This ensures a high level access on the entire datasource, and that the individual items are not shared outside this visibility.
     * 
     */
    @InputImport(name="itemsVisibility")
      private final @Nullable Input<List<GSuitePrincipalArgs>> itemsVisibility;

    public Input<List<GSuitePrincipalArgs>> getItemsVisibility() {
        return this.itemsVisibility == null ? Input.empty() : this.itemsVisibility;
    }

    /**
     * Name of the datasource resource. Format: datasources/{source_id}. The name is ignored when creating a datasource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * IDs of the Long Running Operations (LROs) currently running for this schema.
     * 
     */
    @InputImport(name="operationIds")
      private final @Nullable Input<List<String>> operationIds;

    public Input<List<String>> getOperationIds() {
        return this.operationIds == null ? Input.empty() : this.operationIds;
    }

    /**
     * Can a user request to get thumbnail URI for Items indexed in this data source.
     * 
     */
    @InputImport(name="returnThumbnailUrls")
      private final @Nullable Input<Boolean> returnThumbnailUrls;

    public Input<Boolean> getReturnThumbnailUrls() {
        return this.returnThumbnailUrls == null ? Input.empty() : this.returnThumbnailUrls;
    }

    /**
     * A short name or alias for the source. This value will be used to match the 'source' operator. For example, if the short name is *<value>* then queries like *source:<value>* will only return results for this source. The value must be unique across all datasources. The value must only contain alphanumeric characters (a-zA-Z0-9). The value cannot start with 'google' and cannot be one of the following: mail, gmail, docs, drive, groups, sites, calendar, hangouts, gplus, keep, people, teams. Its maximum length is 32 characters.
     * 
     */
    @InputImport(name="shortName")
      private final @Nullable Input<String> shortName;

    public Input<String> getShortName() {
        return this.shortName == null ? Input.empty() : this.shortName;
    }

    public DataSourceArgs(
        @Nullable Input<Boolean> disableModifications,
        @Nullable Input<Boolean> disableServing,
        Input<String> displayName,
        @Nullable Input<List<String>> indexingServiceAccounts,
        @Nullable Input<List<GSuitePrincipalArgs>> itemsVisibility,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> operationIds,
        @Nullable Input<Boolean> returnThumbnailUrls,
        @Nullable Input<String> shortName) {
        this.disableModifications = disableModifications;
        this.disableServing = disableServing;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.indexingServiceAccounts = indexingServiceAccounts;
        this.itemsVisibility = itemsVisibility;
        this.name = name;
        this.operationIds = operationIds;
        this.returnThumbnailUrls = returnThumbnailUrls;
        this.shortName = shortName;
    }

    private DataSourceArgs() {
        this.disableModifications = Input.empty();
        this.disableServing = Input.empty();
        this.displayName = Input.empty();
        this.indexingServiceAccounts = Input.empty();
        this.itemsVisibility = Input.empty();
        this.name = Input.empty();
        this.operationIds = Input.empty();
        this.returnThumbnailUrls = Input.empty();
        this.shortName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disableModifications;
        private @Nullable Input<Boolean> disableServing;
        private Input<String> displayName;
        private @Nullable Input<List<String>> indexingServiceAccounts;
        private @Nullable Input<List<GSuitePrincipalArgs>> itemsVisibility;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> operationIds;
        private @Nullable Input<Boolean> returnThumbnailUrls;
        private @Nullable Input<String> shortName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableModifications = defaults.disableModifications;
    	      this.disableServing = defaults.disableServing;
    	      this.displayName = defaults.displayName;
    	      this.indexingServiceAccounts = defaults.indexingServiceAccounts;
    	      this.itemsVisibility = defaults.itemsVisibility;
    	      this.name = defaults.name;
    	      this.operationIds = defaults.operationIds;
    	      this.returnThumbnailUrls = defaults.returnThumbnailUrls;
    	      this.shortName = defaults.shortName;
        }

        public Builder setDisableModifications(@Nullable Input<Boolean> disableModifications) {
            this.disableModifications = disableModifications;
            return this;
        }

        public Builder setDisableModifications(@Nullable Boolean disableModifications) {
            this.disableModifications = Input.ofNullable(disableModifications);
            return this;
        }

        public Builder setDisableServing(@Nullable Input<Boolean> disableServing) {
            this.disableServing = disableServing;
            return this;
        }

        public Builder setDisableServing(@Nullable Boolean disableServing) {
            this.disableServing = Input.ofNullable(disableServing);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setIndexingServiceAccounts(@Nullable Input<List<String>> indexingServiceAccounts) {
            this.indexingServiceAccounts = indexingServiceAccounts;
            return this;
        }

        public Builder setIndexingServiceAccounts(@Nullable List<String> indexingServiceAccounts) {
            this.indexingServiceAccounts = Input.ofNullable(indexingServiceAccounts);
            return this;
        }

        public Builder setItemsVisibility(@Nullable Input<List<GSuitePrincipalArgs>> itemsVisibility) {
            this.itemsVisibility = itemsVisibility;
            return this;
        }

        public Builder setItemsVisibility(@Nullable List<GSuitePrincipalArgs> itemsVisibility) {
            this.itemsVisibility = Input.ofNullable(itemsVisibility);
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

        public Builder setOperationIds(@Nullable Input<List<String>> operationIds) {
            this.operationIds = operationIds;
            return this;
        }

        public Builder setOperationIds(@Nullable List<String> operationIds) {
            this.operationIds = Input.ofNullable(operationIds);
            return this;
        }

        public Builder setReturnThumbnailUrls(@Nullable Input<Boolean> returnThumbnailUrls) {
            this.returnThumbnailUrls = returnThumbnailUrls;
            return this;
        }

        public Builder setReturnThumbnailUrls(@Nullable Boolean returnThumbnailUrls) {
            this.returnThumbnailUrls = Input.ofNullable(returnThumbnailUrls);
            return this;
        }

        public Builder setShortName(@Nullable Input<String> shortName) {
            this.shortName = shortName;
            return this;
        }

        public Builder setShortName(@Nullable String shortName) {
            this.shortName = Input.ofNullable(shortName);
            return this;
        }
        public DataSourceArgs build() {
            return new DataSourceArgs(disableModifications, disableServing, displayName, indexingServiceAccounts, itemsVisibility, name, operationIds, returnThumbnailUrls, shortName);
        }
    }
}
