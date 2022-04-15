// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigtable;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.bigtable.inputs.GCPolicyMaxAgeArgs;
import io.pulumi.gcp.bigtable.inputs.GCPolicyMaxVersionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GCPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GCPolicyArgs Empty = new GCPolicyArgs();

    /**
     * The name of the column family.
     * 
     */
    @Import(name="columnFamily", required=true)
      private final Output<String> columnFamily;

    public Output<String> columnFamily() {
        return this.columnFamily;
    }

    /**
     * The name of the Bigtable instance.
     * 
     */
    @Import(name="instanceName", required=true)
      private final Output<String> instanceName;

    public Output<String> instanceName() {
        return this.instanceName;
    }

    /**
     * GC policy that applies to all cells older than the given age.
     * 
     */
    @Import(name="maxAge")
      private final @Nullable Output<GCPolicyMaxAgeArgs> maxAge;

    public Output<GCPolicyMaxAgeArgs> maxAge() {
        return this.maxAge == null ? Codegen.empty() : this.maxAge;
    }

    /**
     * GC policy that applies to all versions of a cell except for the most recent.
     * 
     */
    @Import(name="maxVersions")
      private final @Nullable Output<List<GCPolicyMaxVersionArgs>> maxVersions;

    public Output<List<GCPolicyMaxVersionArgs>> maxVersions() {
        return this.maxVersions == null ? Codegen.empty() : this.maxVersions;
    }

    /**
     * If multiple policies are set, you should choose between `UNION` OR `INTERSECTION`.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> mode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    /**
     * The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The name of the table.
     * 
     */
    @Import(name="table", required=true)
      private final Output<String> table;

    public Output<String> table() {
        return this.table;
    }

    public GCPolicyArgs(
        Output<String> columnFamily,
        Output<String> instanceName,
        @Nullable Output<GCPolicyMaxAgeArgs> maxAge,
        @Nullable Output<List<GCPolicyMaxVersionArgs>> maxVersions,
        @Nullable Output<String> mode,
        @Nullable Output<String> project,
        Output<String> table) {
        this.columnFamily = Objects.requireNonNull(columnFamily, "expected parameter 'columnFamily' to be non-null");
        this.instanceName = Objects.requireNonNull(instanceName, "expected parameter 'instanceName' to be non-null");
        this.maxAge = maxAge;
        this.maxVersions = maxVersions;
        this.mode = mode;
        this.project = project;
        this.table = Objects.requireNonNull(table, "expected parameter 'table' to be non-null");
    }

    private GCPolicyArgs() {
        this.columnFamily = Codegen.empty();
        this.instanceName = Codegen.empty();
        this.maxAge = Codegen.empty();
        this.maxVersions = Codegen.empty();
        this.mode = Codegen.empty();
        this.project = Codegen.empty();
        this.table = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GCPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> columnFamily;
        private Output<String> instanceName;
        private @Nullable Output<GCPolicyMaxAgeArgs> maxAge;
        private @Nullable Output<List<GCPolicyMaxVersionArgs>> maxVersions;
        private @Nullable Output<String> mode;
        private @Nullable Output<String> project;
        private Output<String> table;

        public Builder() {
    	      // Empty
        }

        public Builder(GCPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnFamily = defaults.columnFamily;
    	      this.instanceName = defaults.instanceName;
    	      this.maxAge = defaults.maxAge;
    	      this.maxVersions = defaults.maxVersions;
    	      this.mode = defaults.mode;
    	      this.project = defaults.project;
    	      this.table = defaults.table;
        }

        public Builder columnFamily(Output<String> columnFamily) {
            this.columnFamily = Objects.requireNonNull(columnFamily);
            return this;
        }
        public Builder columnFamily(String columnFamily) {
            this.columnFamily = Output.of(Objects.requireNonNull(columnFamily));
            return this;
        }
        public Builder instanceName(Output<String> instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }
        public Builder instanceName(String instanceName) {
            this.instanceName = Output.of(Objects.requireNonNull(instanceName));
            return this;
        }
        public Builder maxAge(@Nullable Output<GCPolicyMaxAgeArgs> maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Builder maxAge(@Nullable GCPolicyMaxAgeArgs maxAge) {
            this.maxAge = Codegen.ofNullable(maxAge);
            return this;
        }
        public Builder maxVersions(@Nullable Output<List<GCPolicyMaxVersionArgs>> maxVersions) {
            this.maxVersions = maxVersions;
            return this;
        }
        public Builder maxVersions(@Nullable List<GCPolicyMaxVersionArgs> maxVersions) {
            this.maxVersions = Codegen.ofNullable(maxVersions);
            return this;
        }
        public Builder maxVersions(GCPolicyMaxVersionArgs... maxVersions) {
            return maxVersions(List.of(maxVersions));
        }
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder table(Output<String> table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }
        public Builder table(String table) {
            this.table = Output.of(Objects.requireNonNull(table));
            return this;
        }        public GCPolicyArgs build() {
            return new GCPolicyArgs(columnFamily, instanceName, maxAge, maxVersions, mode, project, table);
        }
    }
}
