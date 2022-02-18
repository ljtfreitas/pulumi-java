// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetReportByDepartmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReportByDepartmentArgs Empty = new GetReportByDepartmentArgs();

    /**
     * Department ID
     * 
     */
    @InputImport(name="departmentId", required=true)
    private final String departmentId;

    public String getDepartmentId() {
        return this.departmentId;
    }

    /**
     * Report Name.
     * 
     */
    @InputImport(name="reportName", required=true)
    private final String reportName;

    public String getReportName() {
        return this.reportName;
    }

    public GetReportByDepartmentArgs(
        String departmentId,
        String reportName) {
        this.departmentId = Objects.requireNonNull(departmentId, "expected parameter 'departmentId' to be non-null");
        this.reportName = Objects.requireNonNull(reportName, "expected parameter 'reportName' to be non-null");
    }

    private GetReportByDepartmentArgs() {
        this.departmentId = null;
        this.reportName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReportByDepartmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String departmentId;
        private String reportName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReportByDepartmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.departmentId = defaults.departmentId;
    	      this.reportName = defaults.reportName;
        }

        public Builder setDepartmentId(String departmentId) {
            this.departmentId = Objects.requireNonNull(departmentId);
            return this;
        }

        public Builder setReportName(String reportName) {
            this.reportName = Objects.requireNonNull(reportName);
            return this;
        }

        public GetReportByDepartmentArgs build() {
            return new GetReportByDepartmentArgs(departmentId, reportName);
        }
    }
}
