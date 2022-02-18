// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.customerinsights.enums.CalculationWindowTypes;
import io.pulumi.azurenative.customerinsights.enums.EntityTypes;
import io.pulumi.azurenative.customerinsights.enums.KpiFunctions;
import io.pulumi.azurenative.customerinsights.inputs.KpiAliasArgs;
import io.pulumi.azurenative.customerinsights.inputs.KpiExtractArgs;
import io.pulumi.azurenative.customerinsights.inputs.KpiThresholdsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KpiArgs extends io.pulumi.resources.ResourceArgs {

    public static final KpiArgs Empty = new KpiArgs();

    /**
     * The aliases.
     * 
     */
    @InputImport(name="aliases")
    private final @Nullable Input<List<KpiAliasArgs>> aliases;

    public Input<List<KpiAliasArgs>> getAliases() {
        return this.aliases == null ? Input.empty() : this.aliases;
    }

    /**
     * The calculation window.
     * 
     */
    @InputImport(name="calculationWindow", required=true)
    private final Input<CalculationWindowTypes> calculationWindow;

    public Input<CalculationWindowTypes> getCalculationWindow() {
        return this.calculationWindow;
    }

    /**
     * Name of calculation window field.
     * 
     */
    @InputImport(name="calculationWindowFieldName")
    private final @Nullable Input<String> calculationWindowFieldName;

    public Input<String> getCalculationWindowFieldName() {
        return this.calculationWindowFieldName == null ? Input.empty() : this.calculationWindowFieldName;
    }

    /**
     * Localized description for the KPI.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<Map<String,String>> description;

    public Input<Map<String,String>> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Localized display name for the KPI.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<Map<String,String>> displayName;

    public Input<Map<String,String>> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The mapping entity type.
     * 
     */
    @InputImport(name="entityType", required=true)
    private final Input<EntityTypes> entityType;

    public Input<EntityTypes> getEntityType() {
        return this.entityType;
    }

    /**
     * The mapping entity name.
     * 
     */
    @InputImport(name="entityTypeName", required=true)
    private final Input<String> entityTypeName;

    public Input<String> getEntityTypeName() {
        return this.entityTypeName;
    }

    /**
     * The computation expression for the KPI.
     * 
     */
    @InputImport(name="expression", required=true)
    private final Input<String> expression;

    public Input<String> getExpression() {
        return this.expression;
    }

    /**
     * The KPI extracts.
     * 
     */
    @InputImport(name="extracts")
    private final @Nullable Input<List<KpiExtractArgs>> extracts;

    public Input<List<KpiExtractArgs>> getExtracts() {
        return this.extracts == null ? Input.empty() : this.extracts;
    }

    /**
     * The filter expression for the KPI.
     * 
     */
    @InputImport(name="filter")
    private final @Nullable Input<String> filter;

    public Input<String> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * The computation function for the KPI.
     * 
     */
    @InputImport(name="function", required=true)
    private final Input<KpiFunctions> function;

    public Input<KpiFunctions> getFunction() {
        return this.function;
    }

    /**
     * the group by properties for the KPI.
     * 
     */
    @InputImport(name="groupBy")
    private final @Nullable Input<List<String>> groupBy;

    public Input<List<String>> getGroupBy() {
        return this.groupBy == null ? Input.empty() : this.groupBy;
    }

    /**
     * The name of the hub.
     * 
     */
    @InputImport(name="hubName", required=true)
    private final Input<String> hubName;

    public Input<String> getHubName() {
        return this.hubName;
    }

    /**
     * The name of the KPI.
     * 
     */
    @InputImport(name="kpiName")
    private final @Nullable Input<String> kpiName;

    public Input<String> getKpiName() {
        return this.kpiName == null ? Input.empty() : this.kpiName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The KPI thresholds.
     * 
     */
    @InputImport(name="thresHolds")
    private final @Nullable Input<KpiThresholdsArgs> thresHolds;

    public Input<KpiThresholdsArgs> getThresHolds() {
        return this.thresHolds == null ? Input.empty() : this.thresHolds;
    }

    /**
     * The unit of measurement for the KPI.
     * 
     */
    @InputImport(name="unit")
    private final @Nullable Input<String> unit;

    public Input<String> getUnit() {
        return this.unit == null ? Input.empty() : this.unit;
    }

    public KpiArgs(
        @Nullable Input<List<KpiAliasArgs>> aliases,
        Input<CalculationWindowTypes> calculationWindow,
        @Nullable Input<String> calculationWindowFieldName,
        @Nullable Input<Map<String,String>> description,
        @Nullable Input<Map<String,String>> displayName,
        Input<EntityTypes> entityType,
        Input<String> entityTypeName,
        Input<String> expression,
        @Nullable Input<List<KpiExtractArgs>> extracts,
        @Nullable Input<String> filter,
        Input<KpiFunctions> function,
        @Nullable Input<List<String>> groupBy,
        Input<String> hubName,
        @Nullable Input<String> kpiName,
        Input<String> resourceGroupName,
        @Nullable Input<KpiThresholdsArgs> thresHolds,
        @Nullable Input<String> unit) {
        this.aliases = aliases;
        this.calculationWindow = Objects.requireNonNull(calculationWindow, "expected parameter 'calculationWindow' to be non-null");
        this.calculationWindowFieldName = calculationWindowFieldName;
        this.description = description;
        this.displayName = displayName;
        this.entityType = Objects.requireNonNull(entityType, "expected parameter 'entityType' to be non-null");
        this.entityTypeName = Objects.requireNonNull(entityTypeName, "expected parameter 'entityTypeName' to be non-null");
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.extracts = extracts;
        this.filter = filter;
        this.function = Objects.requireNonNull(function, "expected parameter 'function' to be non-null");
        this.groupBy = groupBy;
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.kpiName = kpiName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.thresHolds = thresHolds;
        this.unit = unit;
    }

    private KpiArgs() {
        this.aliases = Input.empty();
        this.calculationWindow = Input.empty();
        this.calculationWindowFieldName = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.entityType = Input.empty();
        this.entityTypeName = Input.empty();
        this.expression = Input.empty();
        this.extracts = Input.empty();
        this.filter = Input.empty();
        this.function = Input.empty();
        this.groupBy = Input.empty();
        this.hubName = Input.empty();
        this.kpiName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.thresHolds = Input.empty();
        this.unit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KpiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<KpiAliasArgs>> aliases;
        private Input<CalculationWindowTypes> calculationWindow;
        private @Nullable Input<String> calculationWindowFieldName;
        private @Nullable Input<Map<String,String>> description;
        private @Nullable Input<Map<String,String>> displayName;
        private Input<EntityTypes> entityType;
        private Input<String> entityTypeName;
        private Input<String> expression;
        private @Nullable Input<List<KpiExtractArgs>> extracts;
        private @Nullable Input<String> filter;
        private Input<KpiFunctions> function;
        private @Nullable Input<List<String>> groupBy;
        private Input<String> hubName;
        private @Nullable Input<String> kpiName;
        private Input<String> resourceGroupName;
        private @Nullable Input<KpiThresholdsArgs> thresHolds;
        private @Nullable Input<String> unit;

        public Builder() {
    	      // Empty
        }

        public Builder(KpiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.calculationWindow = defaults.calculationWindow;
    	      this.calculationWindowFieldName = defaults.calculationWindowFieldName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.entityTypeName = defaults.entityTypeName;
    	      this.expression = defaults.expression;
    	      this.extracts = defaults.extracts;
    	      this.filter = defaults.filter;
    	      this.function = defaults.function;
    	      this.groupBy = defaults.groupBy;
    	      this.hubName = defaults.hubName;
    	      this.kpiName = defaults.kpiName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.thresHolds = defaults.thresHolds;
    	      this.unit = defaults.unit;
        }

        public Builder setAliases(@Nullable Input<List<KpiAliasArgs>> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder setAliases(@Nullable List<KpiAliasArgs> aliases) {
            this.aliases = Input.ofNullable(aliases);
            return this;
        }

        public Builder setCalculationWindow(Input<CalculationWindowTypes> calculationWindow) {
            this.calculationWindow = Objects.requireNonNull(calculationWindow);
            return this;
        }

        public Builder setCalculationWindow(CalculationWindowTypes calculationWindow) {
            this.calculationWindow = Input.of(Objects.requireNonNull(calculationWindow));
            return this;
        }

        public Builder setCalculationWindowFieldName(@Nullable Input<String> calculationWindowFieldName) {
            this.calculationWindowFieldName = calculationWindowFieldName;
            return this;
        }

        public Builder setCalculationWindowFieldName(@Nullable String calculationWindowFieldName) {
            this.calculationWindowFieldName = Input.ofNullable(calculationWindowFieldName);
            return this;
        }

        public Builder setDescription(@Nullable Input<Map<String,String>> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable Map<String,String> description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<Map<String,String>> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable Map<String,String> displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEntityType(Input<EntityTypes> entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }

        public Builder setEntityType(EntityTypes entityType) {
            this.entityType = Input.of(Objects.requireNonNull(entityType));
            return this;
        }

        public Builder setEntityTypeName(Input<String> entityTypeName) {
            this.entityTypeName = Objects.requireNonNull(entityTypeName);
            return this;
        }

        public Builder setEntityTypeName(String entityTypeName) {
            this.entityTypeName = Input.of(Objects.requireNonNull(entityTypeName));
            return this;
        }

        public Builder setExpression(Input<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Input.of(Objects.requireNonNull(expression));
            return this;
        }

        public Builder setExtracts(@Nullable Input<List<KpiExtractArgs>> extracts) {
            this.extracts = extracts;
            return this;
        }

        public Builder setExtracts(@Nullable List<KpiExtractArgs> extracts) {
            this.extracts = Input.ofNullable(extracts);
            return this;
        }

        public Builder setFilter(@Nullable Input<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setFunction(Input<KpiFunctions> function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }

        public Builder setFunction(KpiFunctions function) {
            this.function = Input.of(Objects.requireNonNull(function));
            return this;
        }

        public Builder setGroupBy(@Nullable Input<List<String>> groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        public Builder setGroupBy(@Nullable List<String> groupBy) {
            this.groupBy = Input.ofNullable(groupBy);
            return this;
        }

        public Builder setHubName(Input<String> hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }

        public Builder setHubName(String hubName) {
            this.hubName = Input.of(Objects.requireNonNull(hubName));
            return this;
        }

        public Builder setKpiName(@Nullable Input<String> kpiName) {
            this.kpiName = kpiName;
            return this;
        }

        public Builder setKpiName(@Nullable String kpiName) {
            this.kpiName = Input.ofNullable(kpiName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setThresHolds(@Nullable Input<KpiThresholdsArgs> thresHolds) {
            this.thresHolds = thresHolds;
            return this;
        }

        public Builder setThresHolds(@Nullable KpiThresholdsArgs thresHolds) {
            this.thresHolds = Input.ofNullable(thresHolds);
            return this;
        }

        public Builder setUnit(@Nullable Input<String> unit) {
            this.unit = unit;
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = Input.ofNullable(unit);
            return this;
        }

        public KpiArgs build() {
            return new KpiArgs(aliases, calculationWindow, calculationWindowFieldName, description, displayName, entityType, entityTypeName, expression, extracts, filter, function, groupBy, hubName, kpiName, resourceGroupName, thresHolds, unit);
        }
    }
}
