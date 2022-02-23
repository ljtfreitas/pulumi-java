// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionTargetHttpsProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionTargetHttpsProxyArgs Empty = new RegionTargetHttpsProxyArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The Region in which the created target https proxy should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @InputImport(name="region")
        private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * A list of RegionSslCertificate resources that are used to authenticate
     * connections between users and the load balancer. Currently, exactly
     * one SSL certificate must be specified.
     * 
     */
    @InputImport(name="sslCertificates", required=true)
        private final Input<List<String>> sslCertificates;

    public Input<List<String>> getSslCertificates() {
        return this.sslCertificates;
    }

    /**
     * A reference to the RegionUrlMap resource that defines the mapping from URL
     * to the RegionBackendService.
     * 
     */
    @InputImport(name="urlMap", required=true)
        private final Input<String> urlMap;

    public Input<String> getUrlMap() {
        return this.urlMap;
    }

    public RegionTargetHttpsProxyArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<List<String>> sslCertificates,
        Input<String> urlMap) {
        this.description = description;
        this.name = name;
        this.project = project;
        this.region = region;
        this.sslCertificates = Objects.requireNonNull(sslCertificates, "expected parameter 'sslCertificates' to be non-null");
        this.urlMap = Objects.requireNonNull(urlMap, "expected parameter 'urlMap' to be non-null");
    }

    private RegionTargetHttpsProxyArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.sslCertificates = Input.empty();
        this.urlMap = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionTargetHttpsProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<List<String>> sslCertificates;
        private Input<String> urlMap;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionTargetHttpsProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.urlMap = defaults.urlMap;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setSslCertificates(Input<List<String>> sslCertificates) {
            this.sslCertificates = Objects.requireNonNull(sslCertificates);
            return this;
        }

        public Builder setSslCertificates(List<String> sslCertificates) {
            this.sslCertificates = Input.of(Objects.requireNonNull(sslCertificates));
            return this;
        }

        public Builder setUrlMap(Input<String> urlMap) {
            this.urlMap = Objects.requireNonNull(urlMap);
            return this;
        }

        public Builder setUrlMap(String urlMap) {
            this.urlMap = Input.of(Objects.requireNonNull(urlMap));
            return this;
        }
        public RegionTargetHttpsProxyArgs build() {
            return new RegionTargetHttpsProxyArgs(description, name, project, region, sslCertificates, urlMap);
        }
    }
}
