// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RedirectResponse {
    /**
     * The user-supplied [glob](https://firebase.google.com/docs/hosting/full-config#glob_pattern_matching) to match against the request URL path.
     * 
     */
    private final String glob;
    /**
     * The value to put in the HTTP location header of the response. The location can contain capture group values from the pattern using a `:` prefix to identify the segment and an optional `*` to capture the rest of the URL. For example: "glob": "/:capture*", "statusCode": 301, "location": "https://example.com/foo/:capture"
     * 
     */
    private final String location;
    /**
     * The user-supplied RE2 regular expression to match against the request URL path.
     * 
     */
    private final String regex;
    /**
     * The status HTTP code to return in the response. It must be a valid 3xx status code.
     * 
     */
    private final Integer statusCode;

    @OutputCustomType.Constructor({"glob","location","regex","statusCode"})
    private RedirectResponse(
        String glob,
        String location,
        String regex,
        Integer statusCode) {
        this.glob = Objects.requireNonNull(glob);
        this.location = Objects.requireNonNull(location);
        this.regex = Objects.requireNonNull(regex);
        this.statusCode = Objects.requireNonNull(statusCode);
    }

    /**
     * The user-supplied [glob](https://firebase.google.com/docs/hosting/full-config#glob_pattern_matching) to match against the request URL path.
     * 
     */
    public String getGlob() {
        return this.glob;
    }
    /**
     * The value to put in the HTTP location header of the response. The location can contain capture group values from the pattern using a `:` prefix to identify the segment and an optional `*` to capture the rest of the URL. For example: "glob": "/:capture*", "statusCode": 301, "location": "https://example.com/foo/:capture"
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * The user-supplied RE2 regular expression to match against the request URL path.
     * 
     */
    public String getRegex() {
        return this.regex;
    }
    /**
     * The status HTTP code to return in the response. It must be a valid 3xx status code.
     * 
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedirectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String glob;
        private String location;
        private String regex;
        private Integer statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(RedirectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.glob = defaults.glob;
    	      this.location = defaults.location;
    	      this.regex = defaults.regex;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder setGlob(String glob) {
            this.glob = Objects.requireNonNull(glob);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setRegex(String regex) {
            this.regex = Objects.requireNonNull(regex);
            return this;
        }

        public Builder setStatusCode(Integer statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public RedirectResponse build() {
            return new RedirectResponse(glob, location, regex, statusCode);
        }
    }
}
