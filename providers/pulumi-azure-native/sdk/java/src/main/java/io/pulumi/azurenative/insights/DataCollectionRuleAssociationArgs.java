// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataCollectionRuleAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataCollectionRuleAssociationArgs Empty = new DataCollectionRuleAssociationArgs();

    /**
     * The name of the association. The name is case insensitive.
     * 
     */
    @Import(name="associationName")
      private final @Nullable Output<String> associationName;

    public Output<String> getAssociationName() {
        return this.associationName == null ? Output.empty() : this.associationName;
    }

    /**
     * The resource ID of the data collection rule that is to be associated.
     * 
     */
    @Import(name="dataCollectionRuleId")
      private final @Nullable Output<String> dataCollectionRuleId;

    public Output<String> getDataCollectionRuleId() {
        return this.dataCollectionRuleId == null ? Output.empty() : this.dataCollectionRuleId;
    }

    /**
     * Description of the association.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The identifier of the resource.
     * 
     */
    @Import(name="resourceUri", required=true)
      private final Output<String> resourceUri;

    public Output<String> getResourceUri() {
        return this.resourceUri;
    }

    public DataCollectionRuleAssociationArgs(
        @Nullable Output<String> associationName,
        @Nullable Output<String> dataCollectionRuleId,
        @Nullable Output<String> description,
        Output<String> resourceUri) {
        this.associationName = associationName;
        this.dataCollectionRuleId = dataCollectionRuleId;
        this.description = description;
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private DataCollectionRuleAssociationArgs() {
        this.associationName = Output.empty();
        this.dataCollectionRuleId = Output.empty();
        this.description = Output.empty();
        this.resourceUri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionRuleAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> associationName;
        private @Nullable Output<String> dataCollectionRuleId;
        private @Nullable Output<String> description;
        private Output<String> resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCollectionRuleAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationName = defaults.associationName;
    	      this.dataCollectionRuleId = defaults.dataCollectionRuleId;
    	      this.description = defaults.description;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder associationName(@Nullable Output<String> associationName) {
            this.associationName = associationName;
            return this;
        }

        public Builder associationName(@Nullable String associationName) {
            this.associationName = Output.ofNullable(associationName);
            return this;
        }

        public Builder dataCollectionRuleId(@Nullable Output<String> dataCollectionRuleId) {
            this.dataCollectionRuleId = dataCollectionRuleId;
            return this;
        }

        public Builder dataCollectionRuleId(@Nullable String dataCollectionRuleId) {
            this.dataCollectionRuleId = Output.ofNullable(dataCollectionRuleId);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder resourceUri(Output<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }

        public Builder resourceUri(String resourceUri) {
            this.resourceUri = Output.of(Objects.requireNonNull(resourceUri));
            return this;
        }
        public DataCollectionRuleAssociationArgs build() {
            return new DataCollectionRuleAssociationArgs(associationName, dataCollectionRuleId, description, resourceUri);
        }
    }
}
