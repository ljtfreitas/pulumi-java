// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SourceRepresentationInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceRepresentationInstanceArgs Empty = new SourceRepresentationInstanceArgs();

    /**
     * The MySQL version running on your source database server.
     * Possible values are `MYSQL_5_5`, `MYSQL_5_6`, `MYSQL_5_7`, and `MYSQL_8_0`.
     * 
     */
    @Import(name="databaseVersion", required=true)
      private final Output<String> databaseVersion;

    public Output<String> getDatabaseVersion() {
        return this.databaseVersion;
    }

    /**
     * The externally accessible IPv4 address for the source database server.
     * 
     */
    @Import(name="host", required=true)
      private final Output<String> host;

    public Output<String> getHost() {
        return this.host;
    }

    /**
     * The name of the source representation instance. Use any valid Cloud SQL instance name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The externally accessible port for the source database server.
     * Defaults to 3306.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The Region in which the created instance should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    public SourceRepresentationInstanceArgs(
        Output<String> databaseVersion,
        Output<String> host,
        @Nullable Output<String> name,
        @Nullable Output<Integer> port,
        @Nullable Output<String> project,
        @Nullable Output<String> region) {
        this.databaseVersion = Objects.requireNonNull(databaseVersion, "expected parameter 'databaseVersion' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.name = name;
        this.port = port;
        this.project = project;
        this.region = region;
    }

    private SourceRepresentationInstanceArgs() {
        this.databaseVersion = Output.empty();
        this.host = Output.empty();
        this.name = Output.empty();
        this.port = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceRepresentationInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> databaseVersion;
        private Output<String> host;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceRepresentationInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseVersion = defaults.databaseVersion;
    	      this.host = defaults.host;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder databaseVersion(Output<String> databaseVersion) {
            this.databaseVersion = Objects.requireNonNull(databaseVersion);
            return this;
        }

        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = Output.of(Objects.requireNonNull(databaseVersion));
            return this;
        }

        public Builder host(Output<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder host(String host) {
            this.host = Output.of(Objects.requireNonNull(host));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Output.ofNullable(port);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public SourceRepresentationInstanceArgs build() {
            return new SourceRepresentationInstanceArgs(databaseVersion, host, name, port, project, region);
        }
    }
}
