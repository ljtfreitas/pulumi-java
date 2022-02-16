// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigtable;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableIamPolicyArgs Empty = new TableIamPolicyArgs();

    @InputImport(name="instance", required=true)
    private final Input<String> instance;

    public Input<String> getInstance() {
        return this.instance;
    }

    @InputImport(name="policyData", required=true)
    private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="table", required=true)
    private final Input<String> table;

    public Input<String> getTable() {
        return this.table;
    }

    public TableIamPolicyArgs(
        Input<String> instance,
        Input<String> policyData,
        @Nullable Input<String> project,
        Input<String> table) {
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
        this.table = Objects.requireNonNull(table, "expected parameter 'table' to be non-null");
    }

    private TableIamPolicyArgs() {
        this.instance = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
        this.table = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> instance;
        private Input<String> policyData;
        private @Nullable Input<String> project;
        private Input<String> table;

        public Builder() {
    	      // Empty
        }

        public Builder(TableIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.table = defaults.table;
        }

        public Builder setInstance(Input<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Input.of(Objects.requireNonNull(instance));
            return this;
        }

        public Builder setPolicyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder setPolicyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
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

        public Builder setTable(Input<String> table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }

        public Builder setTable(String table) {
            this.table = Input.of(Objects.requireNonNull(table));
            return this;
        }

        public TableIamPolicyArgs build() {
            return new TableIamPolicyArgs(instance, policyData, project, table);
        }
    }
}