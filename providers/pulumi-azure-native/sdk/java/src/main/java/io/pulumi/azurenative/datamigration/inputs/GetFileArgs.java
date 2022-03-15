// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFileArgs Empty = new GetFileArgs();

    /**
     * Name of the File
     * 
     */
    @Import(name="fileName", required=true)
      private final String fileName;

    public String getFileName() {
        return this.fileName;
    }

    /**
     * Name of the resource group
     * 
     */
    @Import(name="groupName", required=true)
      private final String groupName;

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * Name of the project
     * 
     */
    @Import(name="projectName", required=true)
      private final String projectName;

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * Name of the service
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetFileArgs(
        String fileName,
        String groupName,
        String projectName,
        String serviceName) {
        this.fileName = Objects.requireNonNull(fileName, "expected parameter 'fileName' to be non-null");
        this.groupName = Objects.requireNonNull(groupName, "expected parameter 'groupName' to be non-null");
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetFileArgs() {
        this.fileName = null;
        this.groupName = null;
        this.projectName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fileName;
        private String groupName;
        private String projectName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.groupName = defaults.groupName;
    	      this.projectName = defaults.projectName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder fileName(String fileName) {
            this.fileName = Objects.requireNonNull(fileName);
            return this;
        }

        public Builder groupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }

        public Builder projectName(String projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public GetFileArgs build() {
            return new GetFileArgs(fileName, groupName, projectName, serviceName);
        }
    }
}
