// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.DataSourceSalesforceKnowledgeArticleState;
import io.pulumi.awsnative.kendra.inputs.DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs;
import io.pulumi.awsnative.kendra.inputs.DataSourceSalesforceStandardKnowledgeArticleTypeConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceSalesforceKnowledgeArticleConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceSalesforceKnowledgeArticleConfigurationArgs Empty = new DataSourceSalesforceKnowledgeArticleConfigurationArgs();

    @InputImport(name="customKnowledgeArticleTypeConfigurations")
        private final @Nullable Input<List<DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs>> customKnowledgeArticleTypeConfigurations;

    public Input<List<DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs>> getCustomKnowledgeArticleTypeConfigurations() {
        return this.customKnowledgeArticleTypeConfigurations == null ? Input.empty() : this.customKnowledgeArticleTypeConfigurations;
    }

    @InputImport(name="includedStates", required=true)
        private final Input<List<DataSourceSalesforceKnowledgeArticleState>> includedStates;

    public Input<List<DataSourceSalesforceKnowledgeArticleState>> getIncludedStates() {
        return this.includedStates;
    }

    @InputImport(name="standardKnowledgeArticleTypeConfiguration")
        private final @Nullable Input<DataSourceSalesforceStandardKnowledgeArticleTypeConfigurationArgs> standardKnowledgeArticleTypeConfiguration;

    public Input<DataSourceSalesforceStandardKnowledgeArticleTypeConfigurationArgs> getStandardKnowledgeArticleTypeConfiguration() {
        return this.standardKnowledgeArticleTypeConfiguration == null ? Input.empty() : this.standardKnowledgeArticleTypeConfiguration;
    }

    public DataSourceSalesforceKnowledgeArticleConfigurationArgs(
        @Nullable Input<List<DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs>> customKnowledgeArticleTypeConfigurations,
        Input<List<DataSourceSalesforceKnowledgeArticleState>> includedStates,
        @Nullable Input<DataSourceSalesforceStandardKnowledgeArticleTypeConfigurationArgs> standardKnowledgeArticleTypeConfiguration) {
        this.customKnowledgeArticleTypeConfigurations = customKnowledgeArticleTypeConfigurations;
        this.includedStates = Objects.requireNonNull(includedStates, "expected parameter 'includedStates' to be non-null");
        this.standardKnowledgeArticleTypeConfiguration = standardKnowledgeArticleTypeConfiguration;
    }

    private DataSourceSalesforceKnowledgeArticleConfigurationArgs() {
        this.customKnowledgeArticleTypeConfigurations = Input.empty();
        this.includedStates = Input.empty();
        this.standardKnowledgeArticleTypeConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSalesforceKnowledgeArticleConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs>> customKnowledgeArticleTypeConfigurations;
        private Input<List<DataSourceSalesforceKnowledgeArticleState>> includedStates;
        private @Nullable Input<DataSourceSalesforceStandardKnowledgeArticleTypeConfigurationArgs> standardKnowledgeArticleTypeConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSalesforceKnowledgeArticleConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customKnowledgeArticleTypeConfigurations = defaults.customKnowledgeArticleTypeConfigurations;
    	      this.includedStates = defaults.includedStates;
    	      this.standardKnowledgeArticleTypeConfiguration = defaults.standardKnowledgeArticleTypeConfiguration;
        }

        public Builder setCustomKnowledgeArticleTypeConfigurations(@Nullable Input<List<DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs>> customKnowledgeArticleTypeConfigurations) {
            this.customKnowledgeArticleTypeConfigurations = customKnowledgeArticleTypeConfigurations;
            return this;
        }

        public Builder setCustomKnowledgeArticleTypeConfigurations(@Nullable List<DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs> customKnowledgeArticleTypeConfigurations) {
            this.customKnowledgeArticleTypeConfigurations = Input.ofNullable(customKnowledgeArticleTypeConfigurations);
            return this;
        }

        public Builder setIncludedStates(Input<List<DataSourceSalesforceKnowledgeArticleState>> includedStates) {
            this.includedStates = Objects.requireNonNull(includedStates);
            return this;
        }

        public Builder setIncludedStates(List<DataSourceSalesforceKnowledgeArticleState> includedStates) {
            this.includedStates = Input.of(Objects.requireNonNull(includedStates));
            return this;
        }

        public Builder setStandardKnowledgeArticleTypeConfiguration(@Nullable Input<DataSourceSalesforceStandardKnowledgeArticleTypeConfigurationArgs> standardKnowledgeArticleTypeConfiguration) {
            this.standardKnowledgeArticleTypeConfiguration = standardKnowledgeArticleTypeConfiguration;
            return this;
        }

        public Builder setStandardKnowledgeArticleTypeConfiguration(@Nullable DataSourceSalesforceStandardKnowledgeArticleTypeConfigurationArgs standardKnowledgeArticleTypeConfiguration) {
            this.standardKnowledgeArticleTypeConfiguration = Input.ofNullable(standardKnowledgeArticleTypeConfiguration);
            return this;
        }
        public DataSourceSalesforceKnowledgeArticleConfigurationArgs build() {
            return new DataSourceSalesforceKnowledgeArticleConfigurationArgs(customKnowledgeArticleTypeConfigurations, includedStates, standardKnowledgeArticleTypeConfiguration);
        }
    }
}
